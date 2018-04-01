package com.michalszalkowski.interfaced;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class InterfaceTest3 {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User(0, false, "admin"),
				null,
				new User(1, true, "user"),
				new User(2, true, "admin")
		);

		Optional<User> first = users.stream()
				.filter(Objects::nonNull)
				.filter(User::isRealUser)
				.filter(User::isAdmin)
				.findFirst();

		System.out.println(first.isPresent() ? first.get() : "");
	}
}
