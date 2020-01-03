package com.sapient.ecom.JWTSecurity.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class JwtAuthnticationToken extends UsernamePasswordAuthenticationToken {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4720062563042654354L;
	private String token;

	public JwtAuthnticationToken(String token) {
		super(null, null);
		this.token = token;
		// TODO Auto-generated constructor stub
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Object getCredetial() {
		return null;
	}

	public Object getPrincipal() {
		return null;
	}
}
