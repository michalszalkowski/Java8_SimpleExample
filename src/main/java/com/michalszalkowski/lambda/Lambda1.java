package com.michalszalkowski.lambda;

@FunctionalInterface
interface PasswordEncoder {
	String encode(String password, String salt);
}

public class Lambda1 {

	public static void main(String[] args) {

		PasswordEncoder passwordEncoder = (password, salt) -> password.toUpperCase();

		System.out.println(
				passwordEncoder.encode("abcdef", "salt")
		);
	}
}