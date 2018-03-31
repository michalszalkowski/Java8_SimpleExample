package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream15 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList(
				"Cat",
				"Dog",
				"Empty?",
				"",
				null,
				""
		);

		List<String> newWords = words.stream()
				.filter(x -> x != null && !x.isEmpty())
				.collect(Collectors.toList());

		long count = words.stream()
				.filter(x -> x != null && !x.isEmpty())
				.count();

		System.out.println(count);
		System.out.println(newWords);
	}

}
