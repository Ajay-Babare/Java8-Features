package com.ajay.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sita","Ram","Radhe","Shyam");
		
		Consumer<String> printName = n -> System.out.println(n);
		names.forEach(printName);
	}

}
