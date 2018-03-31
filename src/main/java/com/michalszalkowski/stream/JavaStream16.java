package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream16 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("tasty", "rush",
				"shade", "welcome", "untidy", "church",
				"knock", "current", "bawdy", "chemical",
				"stiff", "cloth", "ship", "spiteful",
				"ink", "nest", "damage", "shallow", "touch", "blush"
		);

		System.out.println(
				words.stream().reduce("", (a, b) -> a + " " + b)
		);

		System.out.println(
				words.stream().reduce((a, b) -> a + " " + b)
		);

		System.out.println(
				words.stream().collect(Collectors.joining(" "))
		);

	}

}
