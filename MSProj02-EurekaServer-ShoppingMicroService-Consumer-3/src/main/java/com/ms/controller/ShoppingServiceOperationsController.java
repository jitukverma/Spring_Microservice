package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationsController {
 
	@Autowired
	private BillingServiceConsumerClient client;

	 @GetMapping("/cart")
	 public ResponseEntity<String> doShopping(){
		 //use Client Comp
		 System.out.println("Hello In Shopping");
		 String resultMsg=client.getBillingInfo();
		 return new ResponseEntity<String>("Shoppin the itemss",HttpStatus.OK);
	 }
}
