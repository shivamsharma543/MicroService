package com.sapient.ecom.JWTSecurity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.sapient.ecom.JWTSecurity.dao.UserRepository;
import com.sapient.ecom.JWTSecurity.domain.User;

@Component
public class UserService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private PasswordEncoder bCryptEncoder;

	
	  @Override
	  
	  public UserDetails loadUserByUsername(String username) throws
	  UsernameNotFoundException { User user = userRepository.findByName(username);
	  if (user == null) { throw new
	  UsernameNotFoundException("User not found with username: " + username); }
	  return new org.springframework.security.core.userdetails.User(user.getName(),
	  user.getPassword(), new ArrayList<>()); }
	 

	/*
	 * public UserDetails loadUserByUsername(String username) { Optional<User> user
	 * = ls.stream().filter(u -> u.getName().equals(username)).findAny();
	 * 
	 * if (user.isPresent()) return new
	 * org.springframework.security.core.userdetails.User(user.get().getName(),
	 * user.get().getPassword(), new ArrayList<>()); else return new
	 * org.springframework.security.core.userdetails.User("DefaultName",
	 * "DefaultPassword", new ArrayList<>()); }
	 */

	
	  public User addUser(User user) { 
		  User newUser = new User();
		  newUser.setName(user.getName());
		  newUser.setPassword(bCryptEncoder.encode(user.getPassword()));
		  newUser.setRole(user.getRole());
		  
		  return userRepository.save(newUser); 
		  }
	 
	/*
	 * public User addUser(User user) { ls.add(user); if (ls.get(user.getId()) !=
	 * null) return ls.get(user.getId()); else return user; }
	 */

	public void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

}
