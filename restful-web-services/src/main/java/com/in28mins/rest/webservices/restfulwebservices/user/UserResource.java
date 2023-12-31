package com.in28mins.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private UserDaoService service;
	public UserResource(UserDaoService service) {
		this.service = service;
	}
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findALL();
		
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		service.save(user);
		
	}

}
