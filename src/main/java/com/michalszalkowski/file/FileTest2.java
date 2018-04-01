package com.michalszalkowski.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileTest2 {

	public static void main(String[] args) {

		String file = "/home/szalek/Workspace/Playground/java8_1/src/main/resources/lines.txt";
		List<String> data = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(file))) {
			data = stream.collect(Collectors.toList());
		} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}

		data.forEach(item -> System.out.println(item));
	}
}