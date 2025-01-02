package com.ajay.function;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> cancatenate = (a, b) -> a+ " " +b; 
		
		System.out.println(cancatenate.apply("Hello", "World"));
	}

}
