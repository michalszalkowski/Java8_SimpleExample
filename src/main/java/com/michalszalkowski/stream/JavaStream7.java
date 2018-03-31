package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.List;

public class JavaStream7 {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("aa", "bb", "cc", "dd");

		items
				.stream()
				.map(x -> new StringDto(x))
				.forEach(System.out::println);

	}

	static class StringDto {

		private String name;

		public StringDto(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "StringDto{" +
					"name='" + name + '\'' +
					'}';
		}
	}

}
