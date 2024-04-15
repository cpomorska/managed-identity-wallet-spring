/*
 * *******************************************************************************
 *  Copyright (c) 2021,2023 Contributors to the Eclipse Foundation
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

package org.eclipse.tractusx.managedidentitywallets.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.tractusx.managedidentitywallets.domain.KeyPair;
import org.eclipse.tractusx.managedidentitywallets.domain.SigningServiceType;

import java.util.Objects;

/**
 * The type Wallet key.
 */
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="wallet_key")
public class WalletKey extends MIWBaseEntity {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial", nullable = false, unique = true)
    private long id;

    @Column(nullable = false)
    private String vaultAccessToken;

    @Column(nullable = false)
    private String referenceKey;

    @Column(nullable = false)
    private String privateKey;

    @Column(nullable = false)
    private String publicKey;

    @ManyToOne
    // @MapsId
    @JoinColumn(name = "wallet_id", columnDefinition = "bigint")
    @JsonBackReference
    private Wallet wallet;

    private String keyId;

    @Column(nullable = false)
    private String algorithm;

    public KeyPair toDto() {
        return new KeyPair(keyId, privateKey, publicKey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletKey walletKey = (WalletKey) o;
        return Objects.equals(id, walletKey.id) && Objects.equals(keyId, walletKey.keyId) && Objects.equals(algorithm, walletKey.algorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyId, algorithm);
    }
}
