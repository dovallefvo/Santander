package com.dovalle.microservices.serverdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaServer
@Configuration
@EnableAutoConfiguration
public class ServerDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDiscoveryApplication.class, args);
	}

}
