package com.ajay.collectionenhancements;

import java.util.ArrayList;
import java.util.List;

public class CollectionImprovements {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Ram",100000));
		empList.add(new Employee(2,"Shyam",200000));
		
		// with forEach
		// Consumer<Employee> con = (e) -> { // logic };
		empList.forEach((e)->{
			System.out.println("Id : "+e.getId());
			System.out.println("Name : "+e.getName());
			System.out.println("Salary : "+e.getSalary());
			System.out.println();
		});
		
		//without forEach
		for(int i=0 ; i<empList.size();i++) {
			System.out.println("Id : "+empList.get(i).getId());
			System.out.println("Name : "+empList.get(i).getName());
			System.out.println("Salary : "+empList.get(i).getSalary());
			System.out.println();
		}
		
		
		// public boolean removeif(Predicate filter)		
		//Predicate<Employee> filter = (e) -> { // logic};
		System.out.println(empList.removeIf( e-> e.getName().startsWith("R")));
		System.out.println(empList.toString());
		
		
	}
}
