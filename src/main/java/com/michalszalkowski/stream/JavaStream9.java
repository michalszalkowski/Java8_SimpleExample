package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaStream9 {

	public static void main(String[] args) {

		int[] numbers = new int[]{5, 4, 1, 2, 6, 7, 3, 8, 9, 0, 10};

		Arrays.stream(numbers)
				.sorted()
				.filter(x -> x % 2 == 0)
				.forEach(System.out::println);

		Arrays.stream(numbers)
				.sorted()
				.filter(x -> x % 2 == 0)
				.mapToObj(x -> new SomeDto(x))
				.collect(Collectors.toList())
				.forEach(System.out::println);

	}

	static class SomeDto {
		public int val;

		public SomeDto(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return "SomeDto{" +
					"val=" + val +
					'}';
		}
	}
}