package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsProj04BillingMicroServiceProducer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsProj04BillingMicroServiceProducer1Application.class, args);
	}

}
