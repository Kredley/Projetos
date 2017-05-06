package com.projeto.goku;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncoderTest {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		System.out.println(encoder.encode("admin"));
	}
}
