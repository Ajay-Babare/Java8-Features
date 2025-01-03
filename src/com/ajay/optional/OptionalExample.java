package com.ajay.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<String> obj = display(null);
		System.out.println(obj.isPresent());
//		System.out.println(obj.get());
		
	}
	
	public static Optional<String> display(String s){
		Optional<String> op = Optional.ofNullable(s);
//		Optional<String> op1 = Optional.of(s);
		return op;
	}

}
