package com.alurachallenge.apiforohub.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                .info(new Info()
                        .title("FORO HUB API / CHALLENGE")
                        .description("API Rest de la aplicación foro-hub, que contiene las funcionalidades de CRUD de tópicos y usiuarios.")
                        .contact(new Contact()
                                .name("Carolina Bernal")
                                .email("caritobernal3193@gmail.com")));
    }
}
