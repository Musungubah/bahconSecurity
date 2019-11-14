package com.bah.security.demo.login;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bah.security.demo.api.Customer;




@RestController("/register")
public class RegisterController {
	
	@PostMapping
	public void registerUser(@RequestBody Customer customer) {
		
		final String uri = "http://10.100.143.157:9090/api/customers/";
	     System.out.println(customer);
	    RestTemplate restTemplate = new RestTemplate();
	    HttpStatus status;
	    restTemplate.postForObject(uri, customer, Customer.class);
		//restTemplate.getForObject(uri, Customer.class);
	    //ResponseEntity<?> response = restTemplate.postForObject(uri, customer, responseType, uriVariables)
	}

}
