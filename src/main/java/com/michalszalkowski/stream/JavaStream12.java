package com.michalszalkowski.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream12 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Sara", Gender.FEMALE, 20),
				new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20),
				new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32),
				new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72),
				new Person("Jill", Gender.FEMALE, 12)
		);

		List<String> listOfName = people
				.stream()
				.filter(x -> x.age > 18)
				.map(x -> x.name.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(listOfName);
	}

	static class Person {

		public String name;
		public Gender gender;
		public int age;

		public Person(String name, Gender gender, int age) {
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
	}

	enum Gender {
		MALE,
		FEMALE
	}
}