package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.List;

public class JavaStream6 {
	public static void main(String[] args) {

		List<String> items = Arrays.asList("aa", "bb", "cc", "dd");
		items
				.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);

	}
}
