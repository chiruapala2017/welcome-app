package com.tcs.poc.welcomefile.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.poc.welcomefile.model.JwtRequest;
import com.tcs.poc.welcomefile.repository.JwtRequestRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private JwtRequestRepository jwtRequestRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		JwtRequest jwtRequest = jwtRequestRepository.findOne(username);
		if(jwtRequest!=null)
		{
			return new User(username, jwtRequest.getPassword(),
					new ArrayList<>());
		}
		else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		/*if ("javainuse1".equals(username)) {
			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
			return new User("javainuse1", "$2a$10$SxNqTh4phS7dQs2GwW8uC.gz.hbqlttBuyHxctNa4q6FJ5EyIwhvO",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}*/
	}
}