package com.security.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.security.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
	
	public AppUser findByEmail(String email);
}
