package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsProj02BillingMicroServiceProducer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsProj02BillingMicroServiceProducer1Application.class, args);
	}

}
