package com.sapient.ecom.JWTSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.ecom.JWTSecurity.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User findByName(String username);
}
