package com.learning.insurance.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InsuranceEurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceEurekaDiscoveryApplication.class, args);
	}

}
