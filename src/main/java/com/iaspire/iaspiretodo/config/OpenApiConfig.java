package com.iaspire.iaspiretodo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("iAspire Todo API")
                        .version("0.0.1")
                        .description("REST API for iAspire Todo application")
                        .contact(new Contact().name("iAspire").email("dev@iaspire.com"))
                );
    }

}
