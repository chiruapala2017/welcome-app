package com.tcs.poc.welcomefile;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptMain {

	public static void main(String[] args) {
		String encodedPassword = new BCryptPasswordEncoder().encode("password");
		System.out.println(encodedPassword);

	}

}
