package com.michalszalkowski.interfaced;

public class InterfaceTest1 {

	public static void main(String[] args) {
		System.out.println(Vehicle.brand());
	}

	interface Vehicle {
		static String brand() {
			return "Dacia";
		}
	}

}