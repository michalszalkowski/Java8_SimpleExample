package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream8 {

	public static void main(String[] args) {

		List<OldA> oldList = Arrays.asList(
				new OldA("A"),
				new OldA("B"),
				new OldA("C")
		);


		List<OldB> newList = oldList
				.stream()
				.filter(x -> !x.getName().startsWith("A"))
				.map(x -> new OldB(x.getName()))
				.collect(Collectors.toList());

		newList.forEach(System.out::println);
	}

	static class OldA {
		private String name;

		public OldA(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "OldA{" +
					"name='" + name + '\'' +
					'}';
		}
	}

	static class OldB {
		private String name;

		public OldB(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "OldB{" +
					"name='" + name + '\'' +
					'}';
		}
	}

}
