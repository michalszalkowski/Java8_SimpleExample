package com.michalszalkowski.lambda;

import java.util.function.Consumer;

public class Lambda2_Consumer {

	public static void doSomething(Integer i) {
		System.out.println(i);
	}

	public static void main(String[] args) {

		Consumer<Integer> test1 = x -> doSomething(x);
		Consumer<Integer> test2 = Lambda2_Consumer::doSomething;

		test1.accept(10);
		test2.accept(15);
	}
}