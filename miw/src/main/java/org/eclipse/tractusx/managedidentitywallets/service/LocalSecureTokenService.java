/*
 * *******************************************************************************
 *  Copyright (c) 2021,2024 Contributors to the Eclipse Foundation
 *
 *  See the NOTICE file(s) distributed with this work for additional
 *  information regarding copyright ownership.
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0.
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 *
 *  SPDX-License-Identifier: Apache-2.0
 * ******************************************************************************
 */

package org.eclipse.tractusx.managedidentitywallets.service;

import com.nimbusds.jwt.JWT;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.tractusx.managedidentitywallets.dao.entity.JtiRecord;
import org.eclipse.tractusx.managedidentitywallets.dao.entity.Wallet;
import org.eclipse.tractusx.managedidentitywallets.dao.repository.JtiRepository;
import org.eclipse.tractusx.managedidentitywallets.dao.repository.WalletRepository;
import org.eclipse.tractusx.managedidentitywallets.domain.BusinessPartnerNumber;
import org.eclipse.tractusx.managedidentitywallets.domain.DID;
import org.eclipse.tractusx.managedidentitywallets.domain.KeyPair;
import org.eclipse.tractusx.managedidentitywallets.exception.UnknownBusinessPartnerNumberException;
import org.eclipse.tractusx.managedidentitywallets.interfaces.SecureTokenIssuer;
import org.eclipse.tractusx.managedidentitywallets.interfaces.SecureTokenService;
import org.eclipse.tractusx.managedidentitywallets.signing.KeyProvider;
import org.eclipse.tractusx.managedidentitywallets.sts.SecureTokenConfigurationProperties;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import static org.eclipse.tractusx.managedidentitywallets.commons.utils.TokenParsingUtils.getJtiAccessToken;

@Slf4j
@RequiredArgsConstructor
public class LocalSecureTokenService implements SecureTokenService {

    private final WalletRepository walletRepository;

    // Autowired by name!!!
    private final SecureTokenIssuer localSecureTokenIssuer;

    private final SecureTokenConfigurationProperties properties;

    private final JtiRepository jtiRepository;


    @Override
    public JWT issueToken(final DID self, final DID partner, final Set<String> scopes, KeyProvider keyProvider) {
        log.debug("'issueToken' using scopes and DID.");
        KeyPair keyPair = keyProvider.getKeyPair(self);
        // IMPORTANT: we re-use the expiration time intentionally to mitigate any kind of timing attacks,
        // as we're signing two tokens.
        Instant expirationTime = Instant.now().plus(properties.tokenDuration());
        JWT accessToken = this.localSecureTokenIssuer.createAccessToken(keyPair, self, partner, expirationTime, scopes);
        checkAndStoreJti(accessToken);
        return this.localSecureTokenIssuer.createIdToken(keyPair, self, partner, expirationTime, accessToken);
    }

    @Override
    public JWT issueToken(DID self, DID partner, JWT accessToken, KeyProvider keyProvider) {
        log.debug("'issueToken' using an access_token and DID.");
        KeyPair keyPair = keyProvider.getKeyPair(self);
        Instant expirationTime = Instant.now().plus(properties.tokenDuration());
        checkAndStoreJti(accessToken);
        return this.localSecureTokenIssuer.createIdToken(keyPair, self, partner, expirationTime, accessToken);
    }

    private void checkAndStoreJti(JWT accessToken) {
        String jtiValue = getJtiAccessToken(accessToken);
        JtiRecord jti = jtiRepository.getByJti(UUID.fromString(jtiValue));
        if (Objects.isNull(jti)) {
            JtiRecord jtiRecord = JtiRecord.builder().jti(UUID.fromString(jtiValue)).isUsedStatus(false).build();
            jtiRepository.save(jtiRecord);
        }
    }

    @Override
    public JWT issueToken(BusinessPartnerNumber self, BusinessPartnerNumber partner, Set<String> scopes, KeyProvider keyProvider) {
        log.debug("'issueToken' using scopes and BPN.");
        KeyPair keyPair = keyProvider.getKeyPair(self.toString());
        Wallet wallet = walletRepository.getByBpn(self.toString());
        DID selfDid = new DID(wallet.getDid());
        DID partnerDid = new DID(Optional.ofNullable(walletRepository.getByBpn(partner.toString()))
                .orElseThrow(() -> new UnknownBusinessPartnerNumberException(String.format("The provided BPN '%s' is unknown", partner)))
                .getDid());
        // IMPORTANT: we re-use the expiration time intentionally to mitigate any kind of timing attacks,
        // as we're signing two tokens.
        Instant expirationTime = Instant.now().plus(properties.tokenDuration());
        JWT accessToken = this.localSecureTokenIssuer.createAccessToken(keyPair, selfDid, partnerDid, expirationTime, scopes);
        return this.localSecureTokenIssuer.createIdToken(keyPair, selfDid, partnerDid, expirationTime, accessToken);
    }

    @Override
    public JWT issueToken(BusinessPartnerNumber self, BusinessPartnerNumber partner, JWT accessToken, KeyProvider keyProvider) {
        log.debug("'issueToken' using an access_token and BPN.");
        KeyPair keyPair = keyProvider.getKeyPair(self.toString());
        Wallet wallet = walletRepository.getByBpn(self.toString());
        DID selfDid = new DID(wallet.getDid());
        DID partnerDid = new DID(Optional.of(walletRepository.getByBpn(partner.toString()))
                .orElseThrow(() -> new UnknownBusinessPartnerNumberException(String.format("The provided BPN '%s' is unknown", partner)))
                .getDid());
        Instant expirationTime = Instant.now().plus(properties.tokenDuration());
        return this.localSecureTokenIssuer.createIdToken(keyPair, selfDid, partnerDid, expirationTime, accessToken);
    }
}
