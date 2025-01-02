package com.ajay.function;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
		
		System.out.println(dateSupplier.get());
	}

}
