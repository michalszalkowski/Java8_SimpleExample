package com.michalszalkowski.stream;

import java.util.Arrays;
import java.util.List;

public class JavaStream14 {

	public static void main(String[] args) {

		List<ProductItem> items = Arrays.asList(
				new ProductItem("A", 35, true),
				new ProductItem("B", 30, false),
				new ProductItem("C", -25, true),
				new ProductItem("D", -15, false),
				new ProductItem("E", 10, true)
		);

		int sum = items.stream()
				.filter(x -> x.price > 0)
				.filter(x -> x.inCard)
				.mapToInt(x -> x.price)
				.sum();

		System.out.println(sum);

	}

	static class ProductItem {
		public String name;
		public int price;
		public boolean inCard;

		public ProductItem(String name, int price, boolean inCard) {
			this.name = name;
			this.price = price;
			this.inCard = inCard;
		}

		@Override
		public String toString() {
			return "ProductItem{" +
					"name='" + name + '\'' +
					", price=" + price +
					", inCard=" + inCard +
					'}';
		}
	}
}
