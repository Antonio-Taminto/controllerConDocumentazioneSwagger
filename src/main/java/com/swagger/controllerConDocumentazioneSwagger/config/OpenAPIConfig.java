package com.swagger.controllerConDocumentazioneSwagger.config;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class OpenAPIConfig {


    @Bean
    public OpenAPI myOpenAPI() {

        Info info = new Info()
                .title("Controller con documentazione Swagger")
                .version("1.0")
                .description("descrizione").termsOfService("https://google.com");

        return new OpenAPI().info(info);
    }
}