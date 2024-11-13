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

package org.eclipse.tractusx.managedidentitywallets.config.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authorization.event.AuthorizationDeniedEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SecurityEvents {
    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent failures) {
        String excMessage = failures.getException().getMessage();
        log.warn("Failed Authentication: Invalid 'Bearer' token. {}", excMessage);
    }

    @EventListener
    public void onFailure(AuthorizationDeniedEvent failure) {
        if (failure.getAuthorizationDecision() != null) {
            log.warn("Failed Authorization: {}",failure.getAuthorizationDecision().toString());
        } else {
            log.warn("Failed Authorization: Missing 'Authorization' header.");
        }
    }
}

