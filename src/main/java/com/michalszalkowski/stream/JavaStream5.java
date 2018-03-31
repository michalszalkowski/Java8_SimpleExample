package com.michalszalkowski.stream;

import java.util.Arrays;

public class JavaStream5 {
	public static void main(String[] args) {
		String[] test = {"Aa", "Ab", "Ba", "Bb", "Ca", "Cb"};
		Arrays.stream(test)
				.filter(x -> x.endsWith("a"))
				.sorted()
				.forEach(System.out::println);
	}
}
