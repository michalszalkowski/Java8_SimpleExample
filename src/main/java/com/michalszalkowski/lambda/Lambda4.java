package com.michalszalkowski.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda4 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Optional<Integer> first = numbers.stream()
				.filter(e -> e > 3)
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2)
				.findFirst();

		System.out.println(first.get());

	}
}