package com.bah.security.demo.api;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/token")
public class TokenAPI {
	//JWTUtil jwtUtil = new JWTMockUtil();
	 JWTUtil jwtUtil = new JWTHelper();
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> getToken(@RequestBody TokenRequestData tokenRequestData) {
		
		String name = tokenRequestData.getName();
		String password = tokenRequestData.getPassword();
		String scopes = tokenRequestData.getScopes();
		System.out.println(name + "\t"+ password);
		
		final String uri = "http://localhost:8080/api/customers/login";
		System.out.println(uri);
	     
	    RestTemplate restTemplate = new RestTemplate();
	    boolean result = restTemplate.postForObject(uri, tokenRequestData, boolean.class);
	    
	    System.out.println(result);
	    
		/*
		if (username != null && username.length() > 0 
				&& password != null && password.length() > 0 
				&& Authenticator.checkPassword(username, password)) {
			Token token = jwtUtil.createToken(scopes);
			ResponseEntity<?> response = ResponseEntity.ok(token);
			return response;			
		}*/
	    //System.out.println(tokenRequestData.getPassword() + " == " + result.getPassword()); 
	    
	    if(result ) {
	    	Token token = jwtUtil.createToken();
			ResponseEntity<?> response = ResponseEntity.ok(token);
	    	return response;
	    }
	    
		// bad request
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		
	}
	
	
}
