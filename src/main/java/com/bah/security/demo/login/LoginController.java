package com.bah.security.demo.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bah.security.demo.api.Customer;
import com.bah.security.demo.api.Token;

/*
 * @RestController
 * 
 * @RequestMapping("/login") public class LoginController {
 * 
 * @PostMapping public Token getLogin(@RequestBody Customer customer) { final
 * String uri = "http://localhost:8080/api/customers/name/" +
 * customer.getName();
 * 
 * RestTemplate restTemplate = new RestTemplate(); Customer p1 =
 * restTemplate.getForObject(uri, Customer.class);
 * 
 * 
 * return result;
 * 
 * }
 * 
 * }
 */