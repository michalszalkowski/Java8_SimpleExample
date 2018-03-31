package com.michalszalkowski.stream;

import java.util.stream.IntStream;

public class JavaStream1 {
	public static void main(String[] args) {
		IntStream
				.range(1, 10)
				.forEach(System.out::println);

	}
}
