package com.ajay.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		Map<String, Integer>  items = new HashMap<>();
		
		items.put("Apple", 10);
		items.put("Banana", 20);
		
		BiConsumer<String, Integer> printItems = (key, value) -> System.out.println(key+" : "+value);
		
		items.forEach(printItems);
		
	}

}
