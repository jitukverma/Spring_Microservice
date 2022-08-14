package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsProj02ShoppingMicroServiceConsumer3Application {

	public static void main(String[] args) {
		SpringApplication.run(MsProj02ShoppingMicroServiceConsumer3Application.class, args);
	}

}
