package com.michalszalkowski.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda3_Foreach {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		numbers.forEach((Integer value) -> System.out.print(value));
		numbers.forEach((value) -> System.out.print(value));
		numbers.forEach(value -> System.out.print(value));
		numbers.forEach(System.out::print);
	}

}
