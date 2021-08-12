package com.dovalle.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        Docket docketGenerated = new Docket(DocumentationType.SWAGGER_2);
        docketGenerated.apiInfo(this.apiInfo());
        try {
            docketGenerated
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
            System.out.println("SWAGGER2:: \n" + docketGenerated.toString());
        }
        catch (Exception e){
            System.out.println("ERROR SWAGGER2:: \n" + e.getMessage() + e.getCause());
        }

        return docketGenerated;
    }
    /*
    @Bean
    public Docket postsApi() {
        Docket docketGenerated = new Docket(DocumentationType.SWAGGER_2);
        try {
            docketGenerated
                    .groupName("public-api")
                    .apiInfo(apiInfo())
                    .select()
                    //.paths(postPaths())
                    .paths(PathSelectors.any())
                    .build();
        }
        catch (Exception e){
            System.out.println(String.format("ERROR SWAGGER: \nMessage: %s \nCause: %s", e.getMessage(), e.getCause()));
        }

        return docketGenerated;
    }*/


/*
    private Predicate<String> postPaths() {
        return (
                regex("/api/posts.*"),
                regex("/api/comments.*")
        );
    }*/

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Enterprise Person Management - API")
                .description("Project developed to manage person through API rest")
                .termsOfServiceUrl("http://www.dovalle.com")
                .contact(new Contact("Felipe do Valle", "www.dovalle.com", "dovallefvo@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("2.0")
                .build();
    }
}

