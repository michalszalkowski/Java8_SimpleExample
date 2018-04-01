package com.michalszalkowski.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTest1 {

	public static void main(String[] args) {

		String file = "/home/szalek/Workspace/Playground/java8_1/src/main/resources/lines.txt";

		try (Stream<String> stream = Files.lines(Paths.get(file))) {

			stream
					.filter(x -> !x.startsWith("2"))
					.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
	}
}