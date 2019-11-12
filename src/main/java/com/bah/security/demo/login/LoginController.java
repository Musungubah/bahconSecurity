package com.bah.security.demo.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("/test")
	public String getLogin() {
		final String uri = "http://localhost:8083/api/customers";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	    return result;
		
	}

}
