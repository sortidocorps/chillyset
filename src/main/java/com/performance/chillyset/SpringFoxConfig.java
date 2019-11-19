package com.performance.chillyset;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


/**
 * http://localhost:8082/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo(""));
    }

    @Bean
    public Docket swaggerTrainingApi10() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("training-api-1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.performance.chillyset.controller"))
                .paths(PathSelectors.ant("/api/v1/**"))
                .build()
                .apiInfo(getApiInfo("1.0"));
    }

    @Bean
    public Docket swaggerTrainingApi11() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("training-api-1.1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.performance.chillyset.controller"))
                .paths(PathSelectors.ant("/api/v1.1/**"))
                .build()
                .apiInfo(getApiInfo("1.1"));
    }

    @Bean
    public Docket swaggerTrainingApi20() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("training-api-2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.performance.chillyset.controller"))
                .paths(PathSelectors.ant("/api/v2/**"))
                .build()
                .apiInfo(getApiInfo("2.0"));
    }

    private ApiInfo getApiInfo(String version) {
        return new ApiInfo(
                "CHILLYSET",
                "CHILLYSET Performance API",
                version,
                "TERMS OF SERVICE URL",
                new Contact("Dif","http://developers.performance.com/","EMAIL"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}
