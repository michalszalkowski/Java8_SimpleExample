package com.michalszalkowski.lambda;

import java.util.function.Function;

public class Lambda3_Function {

	public static String stringUpperCase(String str) {
		return str != null ? str.toUpperCase() : "";
	}

	public static void main(String[] args) {

		Function<String, String> str1 = Lambda3_Function::stringUpperCase;
		System.out.println(
				str1.apply("Lorem Ipsum")
		);

		Function<String, String> str2 = x -> x.toUpperCase();
		System.out.println(
				str2.apply("Lorem Ipsum")
		);

		Function<String, String> str3 = String::toUpperCase;
		System.out.println(
				str3.apply("Lorem Ipsum")
		);
	}
}