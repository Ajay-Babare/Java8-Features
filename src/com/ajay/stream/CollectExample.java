package com.ajay.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(3,"Sachin",500000));
		empList.add(new Employee(4,"Dhoni",700000));
		empList.add(new Employee(5,"Virat",300000));
		empList.add(new Employee(1,"Suryakumar",400000));
		empList.add(new Employee(2,"Hardik",200000));
		
		
		empList.stream().filter(p->p.getName().startsWith("S")).forEach(c->System.out.println(c.getName()));
		
		List<String> list = empList.stream().map(f->f.getName()).collect(Collectors.toList());
		System.out.println(list);
		
		Set<Integer> collect = empList.stream().map(e -> e.getId()).collect(Collectors.toSet());
		System.out.println(collect);
		
		System.out.println("Natural sorting by Comparable");
		empList.stream().sorted().forEach(e->System.out.println(e));
		System.out.println("Natural sorting reverse order");
		empList.stream().sorted(Collections.reverseOrder()).forEach(e->System.out.println(e));
		
		System.out.println("Custom Sorted by Desc salary using Comparator");
		empList.stream().sorted((e1,e2)->(e1.getSalary()<e2.getSalary())? 1 : (e1.getSalary()==e2.getSalary())? 0 : -1).forEach(e->System.out.println(e));

		// Maximum Salary
		System.out.println("Maximum Salary of Employee");
		Employee employee = empList.stream().max((e1,e2)->(e1.getSalary()<e2.getSalary()?-1:(e1.getSalary()==e2.getSalary())?0:1)).get();
		System.out.println(employee.getName()+" : "+employee.getSalary());
		
		//Minimum Salary 
		System.out.println("Minimum Salary of Employee");
		Employee employee2 = empList.stream().min((e1,e2)->(e1.getSalary()<e2.getSalary()?-1:(e1.getSalary()==e2.getSalary())?0:1)).get();
		System.out.println(employee2.getName()+" : "+employee2.getSalary());
	}

}
