package com.ms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingInfoRestController {
  
	@GetMapping("/info")
	public ResponseEntity<String> showBilling(){
		return new ResponseEntity("Final BillAmt=BillAmt-discount(Rs.5000)",HttpStatus.OK);
	}
}
