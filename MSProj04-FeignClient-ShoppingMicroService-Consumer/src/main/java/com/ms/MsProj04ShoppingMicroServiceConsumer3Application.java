package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MsProj04ShoppingMicroServiceConsumer3Application {

	public static void main(String[] args) {
		SpringApplication.run(MsProj04ShoppingMicroServiceConsumer3Application.class, args);
	}

}
