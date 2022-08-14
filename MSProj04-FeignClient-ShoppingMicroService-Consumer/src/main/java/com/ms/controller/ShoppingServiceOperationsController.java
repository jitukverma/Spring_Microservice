package com.ms.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.client.IBillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationsController {
 
	@Autowired
	private IBillingServiceConsumerClient client;

	 @GetMapping("/cart")
	 public ResponseEntity<String> doShopping(){
		 //System.out.println("Proxy class name ::"+client.getClass()+"----"+Arrays.toString(client.getClass().getInterfaces()));
		 //use Client Comp
		 System.out.println("Hello In Shopping");
		 String resultMsg=client.fetchBillingInfo().getBody();
			/*
			 * try { Thread.sleep(20000); } catch(Exception e) { e.printStackTrace(); }
			 */
		 return new ResponseEntity<String>("Shoppin the itemss ::: "+resultMsg,HttpStatus.OK);
	 }
}
