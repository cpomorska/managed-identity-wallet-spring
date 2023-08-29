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

package org.eclipse.tractusx.managedidentitywallets.config.openapi;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.AllArgsConstructor;
import org.eclipse.tractusx.managedidentitywallets.config.security.SecurityConfigProperties;
import org.eclipse.tractusx.managedidentitywallets.constant.OpenApi;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import java.util.Collections;

/**
 * OpenApiConfig is used for managing the swagger with basic security setup if security is enabled.
 */
@Configuration
@AllArgsConstructor
public class OpenApiConfig {

    private final SecurityConfigProperties properties;

    /**
     * Open api open api.
     *
     * @return the open api
     */
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info();
        info.setTitle(OpenApi.MANAGED_IDENTITY_WALLETS_API);
        info.setDescription(OpenApi.MANAGED_IDENTITY_WALLETS_API_DESCRIPTION);
        info.termsOfService(OpenApi.TERMS_OF_USE);
        info.setVersion(OpenApi.VERSION);

        Contact contact = new Contact();
        contact.name(OpenApi.CONTACT_NAME);
        contact.email(OpenApi.CONTACT_EMAIL);
        contact.url(OpenApi.CONTACT_URL);
        info.contact(contact);

        License license = new License();
        license.name(OpenApi.LICENCE_NAME);
        license.url(OpenApi.LICENCE_URL);
        info.license(license);

        OpenAPI openAPI = new OpenAPI();
        if (Boolean.TRUE.equals(properties.enabled())) {
            openAPI = enableSecurity(openAPI);
        }
        return openAPI.info(info);
    }

    /**
     * Open api definition grouped open api.
     *
     * @return the grouped open api
     */
    @Bean
    public GroupedOpenApi openApiDefinition() {
        return GroupedOpenApi.builder()
                .group(OpenApi.GROUP_DOCS)
                .pathsToMatch(OpenApi.GROUP_PATHS)
                .displayName(OpenApi.GROUP_DISPLAY_NAME)
                .build();
    }

    private OpenAPI enableSecurity(OpenAPI openAPI) {
        Components components = new Components();

        //Auth using access_token
        String accessTokenAuth = OpenApi.STRING_ACCESS_TOKEN_AUTH;
        components.addSecuritySchemes(accessTokenAuth,
                new SecurityScheme().name(accessTokenAuth)
                        .description(OpenApi.SECURITY_SCHEME_DESCRIPTION)
                        .type(SecurityScheme.Type.APIKEY).in(SecurityScheme.In.HEADER).name(HttpHeaders.AUTHORIZATION));
        return openAPI.components(components)
                .addSecurityItem(new SecurityRequirement()
                        .addList(accessTokenAuth, Collections.emptyList()));
    }
}