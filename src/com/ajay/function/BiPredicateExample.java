package com.ajay.function;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isSumEven = (num1,num2) -> (num1+num2) % 2 == 0;
		
		System.out.println(isSumEven.test(2, 2)); // true
		System.out.println(isSumEven.test(2, 3)); // false
	}

}
