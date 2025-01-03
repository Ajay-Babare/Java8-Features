package com.ajay.collectionenhancements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeComparator{
	
}

public class ComparableComparatorExample {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Sachin",400000));
		empList.add(new Employee(3,"Dholi",300000));
		empList.add(new Employee(4,"Virat",100000));
		empList.add(new Employee(2,"Rohit",200000));
		
		// Natural ordering Comparable
		empList.stream().sorted().forEach(e->System.out.println(e));
		
		System.out.println();
		
		// Custom order Comparator
		empList.stream().sorted((e1,e2)-> Integer.compare(e1.getSalary(), e2.getSalary())).forEach(e->System.out.println(e));
		
		
		
	}

}
