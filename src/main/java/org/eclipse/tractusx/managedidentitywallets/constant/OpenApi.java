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

package org.eclipse.tractusx.managedidentitywallets.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * All OpenApi related constants.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OpenApi {
    /* Api, Contact and Licence */
    public static final String MANAGED_IDENTITY_WALLETS_API = "Managed Identity Wallets API";
    public static final String MANAGED_IDENTITY_WALLETS_API_DESCRIPTION = "Managed Identity Wallets API";
    public static final String TERMS_OF_USE = "https://www.eclipse.org/legal/termsofuse.php";
    public static final String VERSION = "0.0.1";
    public static final String CONTACT_NAME = "Eclipse Tractus-X";
    public static final String CONTACT_EMAIL = "tractusx-dev@eclipse.org";
    public static final String CONTACT_URL = "https://projects.eclipse.org/projects/automotive.tractusx";
    public static final String LICENCE_NAME = "Apache 2.0";
    public static final String LICENCE_URL = "https://github.com/eclipse-tractusx/managed-identity-wallets/blob/develop/LICENSE";

    /* Group */
    public static final String GROUP_DOCS = "docs";
    public static final String GROUP_PATHS = "/**";
    public static final String GROUP_DISPLAY_NAME = "Docs";

    /* Securityscheme */
    public static final String STRING_ACCESS_TOKEN_AUTH = "Authenticate using access_token";
    public static final String SECURITY_SCHEME_DESCRIPTION = """
            **Bearer (apiKey)**
            "JWT Authorization header using the Bearer scheme.
            "Enter **Bearer** [space] and then your token in the text input below.
            "Example: Bearer 12345abcdef""";
}
