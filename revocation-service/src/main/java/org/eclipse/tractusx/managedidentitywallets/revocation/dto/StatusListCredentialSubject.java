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

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder()
public class StatusListCredentialSubject {
    public static final String TYPE_ENTRY = "StatusList2021Entry";
    public static final String TYPE_CREDENTIAL = "StatusList2021";
    public static final String TYPE_LIST = "StatusList2021Credential";

    public static final String SUBJECT_ID = "id";
    public static final String SUBJECT_TYPE = "type";
    public static final String SUBJECT_STATUS_PURPOSE = "statusPurpose";
    public static final String SUBJECT_ENCODED_LIST = "encodedList";
    private final String type;
    private String id;
    private String statusPurpose;
    private String encodedList;
}
