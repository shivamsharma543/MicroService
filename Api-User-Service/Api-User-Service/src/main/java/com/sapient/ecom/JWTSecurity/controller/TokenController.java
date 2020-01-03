package com.sapient.ecom.JWTSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sapient.ecom.JWTSecurity.domain.JwtResponse;
import com.sapient.ecom.JWTSecurity.domain.User;
import com.sapient.ecom.JWTSecurity.security.JwtTokenUtil;
import com.sapient.ecom.JWTSecurity.service.UserService;

@RestController
public class TokenController {
	

	
	@Autowired
	UserService userService;
	
	@Autowired
	JwtTokenUtil jwtTokenUtil;
	
	@PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody User authenticationRequest) throws Exception {
		userService.authenticate(authenticationRequest.getName(), authenticationRequest.getPassword());
        final UserDetails userDetails = userService.loadUserByUsername(authenticationRequest.getName());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }
	
	@PostMapping(value = "/register")
    public ResponseEntity<?> addUser(@RequestBody User user) throws Exception {
        User savedUser =userService.addUser(user);
        return ResponseEntity.ok(savedUser);
    }
	

	
	

}
