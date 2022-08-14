package com.ms.client;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {
  
	@Autowired
	private LoadBalancerClient client;
	
	public String getBillingInfo() {
		
		System.out.println("Inside getBillingInfo -- ");
		ServiceInstance instance = client.choose("Billing-Service");
		//get Single Instance from List of Instance
		
		URI uri= instance.getUri();
		//prepare Provide MS Related url to Consume method
		String url=uri.toString()+"/billing/api/info";
		
		//use RestTemplate class obj to consume the provide service
		RestTemplate rt=new RestTemplate();
		//consume the provider service;
		ResponseEntity<String> response= rt.getForEntity(url, String.class);
		System.out.println("response is : "+response);
		//get response content from response object
		String responeContent = response.getBody();
		
		return responeContent;
		
	}
}
