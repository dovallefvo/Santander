package com.myexample.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")//prefix to search in the application.properties
@Getter
@Setter
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")//profile to development
    @Bean //show all the contents when the application is started.
    public String developmentDatabaseConnection(){
        StringBuilder info = new StringBuilder();
        info.append("\nDataBase connection properties for DEV ENVIROMENT:");
        info.append(String.format("\nurl:: \t\t%s \ndriver class:: \t\t%s", this.url, this.driverClassName));
        System.out.println(info.toString());
        return info.toString();
    }

    @Profile("prod")//profile to production
    @Bean //show all the contents when the application is started.
    public String productionDatabaseConnection(){
        StringBuilder info = new StringBuilder();
        info.append("\nDataBase connection properties for PROD ENVIROMENT:");
        info.append(String.format("\nurl:: \t\t%s \ndriver class:: \t\t%s", this.url, this.driverClassName));
        System.out.println(info.toString());
        return info.toString();
    }
}
