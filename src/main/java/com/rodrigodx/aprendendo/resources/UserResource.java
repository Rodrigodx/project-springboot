package com.rodrigodx.aprendendo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigodx.aprendendo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1l, "Rodrigo", "rodrigo@email.com", "995865654", "543321");
		return ResponseEntity.ok().body(u);
	}
}
