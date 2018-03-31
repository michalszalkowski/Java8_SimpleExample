package com.michalszalkowski.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStream13 {

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

		Comparator<Person> personComparator = (p1, p2) -> p1.age > p2.age ? 1 : -1;

		Optional<Person> personMax = people.stream().max(personComparator);
		Optional<Person> personMin = people.stream().min(personComparator);

		System.out.println(personMax.get());
		System.out.println(personMin.get());
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

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", gender=" + gender +
					", age=" + age +
					'}';
		}
	}

	enum Gender {
		MALE,
		FEMALE
	}

}