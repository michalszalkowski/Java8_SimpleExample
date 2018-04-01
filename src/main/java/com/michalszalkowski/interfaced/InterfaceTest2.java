package com.michalszalkowski.interfaced;

public class InterfaceTest2 {

	public static void main(String[] args) {
		Dacia car = new Dacia();
		System.out.println(car.brand());
	}

	static class Dacia implements Vehicle {
	}

	interface Vehicle {
		default String brand() {
			return "SomeVehicle";
		}
	}
}
