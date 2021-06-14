package com.avaliacao.avaliacao.config;




import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConf {

    @Bean
    public Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build().apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo api = new ApiInfo("Projeto Srpint 4", "",
                "Criado por Arthur Ferreira", "Terms",
                new Contact("Arthur Ferreira","ArthurFerreira13","arthurcarvalhof@gmail"), null, null,
                new ArrayList<VendorExtension>());
        return api;

    }
}

