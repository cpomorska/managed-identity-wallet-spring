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

package org.eclipse.tractusx.managedidentitywallets.revocation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.eclipse.tractusx.managedidentitywallets.commons.constant.RevocationPurpose;

@Valid
public record StatusEntryDto(
        // #TODO should be an Identifier (add validation)
        @NotNull @NotBlank @JsonProperty("purpose") String purpose,
        @NotNull @NotBlank @JsonProperty("issuerId") String issuerId) {

    public StatusEntryDto {
        if (!purpose.equalsIgnoreCase(RevocationPurpose.REVOCATION.name())) {
            throw new IllegalArgumentException("purpose should only be revocation at this time");
        }
    }
}
