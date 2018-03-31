package com.michalszalkowski.stream;

import java.util.stream.Stream;

public class JavaStream4 {
	public static void main(String[] args) {
//		Stream.of("Ccccc", "Aaaa", "Bbbbb")
//				.sorted()
//				.findFirst()
//				.ifPresent(System.out::println);

		Stream.of("Ccccc", "Aaaa", "Bbbbb")
				.sorted()
				.filter(x -> x.startsWith("X"))
				.findFirst()
				.ifPresent(x -> System.out.println("!!! = " + x));
	}
}
