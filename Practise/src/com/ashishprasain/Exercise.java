package com.ashishprasain;

import java.util.*;

public class Exercise {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product(1001, "Laptop", 2000f));
		productsList.add(new Product(1002, "TV", 1614f));
		productsList.add(new Product(1003, "Microwave", 300f));
		productsList.add(new Product(1004, "Drone", 1200f));
		productsList.add(new Product(1005, "Macbook", 2500));
		productsList.add(new Product(1006, "Flat", 123200f));
		
		/*
		 * This is filtering data without using Stream in Collections
		 * 
		 * List<Float> priceList = new ArrayList<Float>();
		for(Product product : productsList) {
			if(product.price < 1500) {
				priceList.add(product.price);
			} 
		}
		System.out.println(priceList);
		*/
		
		/* Below is Collections with the use of Streams
		List<Float> priceList = productsList.stream().filter(p -> p.price > 2000).map(p->p.price).collect(Collectors.toList());
		System.out.println(priceList);
		
		*/
		
		/* Converting product List into Set
		Set<Float> priceList = productsList.stream().filter(product -> product.price <3000).map(product -> product.price).collect(Collectors.toSet());
		System.out.println(priceList);
		*/
		
	}
}
class Product {
	private int id;
	private String productName;
	float price;
	
	public Product(int id, String productName, float price) {
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
}

