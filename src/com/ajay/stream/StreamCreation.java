package com.ajay.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.ajay.collectionenhancements.Employee;

public class StreamCreation {

	public static void main(String[] args) {
		
		// 1. Creating a stream from individual values
		Stream<String> stream1 = Stream.of("c","java","python");
		
		// 2. Creating a Stream from an array
		String[] words = {"John","Robert","steve"};
		Stream<String> stream2 = Stream.of(words);
		
		// 3. Creating a stream from java.util.Collection implementation using stream() method
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Ram",100000));
		empList.add(new Employee(2,"Shyam",200000));
		Stream<Employee> stream3 = empList.stream();
		
	}

}
