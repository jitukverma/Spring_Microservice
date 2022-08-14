package com.ms.client;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {
  
	@Autowired
	private DiscoveryClient client;
	
	public String getBillingInfo() {
		
		System.out.println("Inside getBillingInfo -- ");
		List<ServiceInstance> listInstance = client.getInstances("Billing-Service");
		//get Single Instance from List of Instance
		ServiceInstance instance=listInstance.get(0);
		System.out.println("instance : "+instance);
		URI uri= instance.getUri();
		System.out.println("uri is :"+uri);
		//prepare Provide MS Related url to Consume method
		String url=uri.toString()+"/billing/api/info";
		System.out.println("url is :"+url);
		
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
