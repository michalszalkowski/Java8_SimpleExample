package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream11 {

	public static void main(String[] args) {

		List<PostItem> postItems = Arrays.asList(
				new PostItem(1),
				new PostItem(2),
				new PostItem(3),
				new PostItem(4),
				new PostItem(5)
		);

		List<PostItem> collect = postItems
				.stream()
				.skip(2)
				.limit(5)
				.collect(Collectors.toList());

		collect.forEach(System.out::println);
	}


	static class PostItem {

		public int id;

		public PostItem(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "PostItem{" +
					"id=" + id +
					'}';
		}
	}

}