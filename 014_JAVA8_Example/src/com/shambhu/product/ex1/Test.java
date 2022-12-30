package com.shambhu.product.ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Product p1 = new Product(100, "java", "Books", 1000);
		Product p2 = new Product(200, "c", "Books", 200);
		Product p3 = new Product(300, "CSS", "Books", 100);
		Product p4 = new Product(400, "java", "Books", 130);
		Product p5 = new Product(500, "Nokia", "Phone", 204);
		Product p6 = new Product(600, "samsung", "Phone", 900);
		Product p7 = new Product(700, "Lenovo", "Phone", 709);

		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		//products.stream().filter(p -> p.getCategory().equalsIgnoreCase("Books")).filter(p -> p.getPrice() > 199)
				//.forEach(System.out::println);

		Product cheapetsProduct = products.stream().filter(x -> x.getCategory().equalsIgnoreCase("Phone"))
				.min(Comparator.comparing(Product::getPrice)).get();
		System.out.println(cheapetsProduct);

	}

}
