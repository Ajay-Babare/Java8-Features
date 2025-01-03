package com.ajay.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(3,"Sachin",500000));
		empList.add(new Employee(4,"Dhoni",700000));
		empList.add(new Employee(5,"Virat",300000));
		empList.add(new Employee(1,"Suryakumar",400000));
		empList.add(new Employee(1,"Suryakumar",400000));
		empList.add(new Employee(1,"Suryakumar",400000));
		empList.add(new Employee(2,"Hardik",200000));
		empList.add(new Employee(2,"Hardik",200000));
		
		// filter(Predicate)
		System.out.println("Filter Records Start with S ");
		empList.stream().filter(p->p.getName().startsWith("S")).forEach(c->System.out.println(c.getName()));
		
		// map(Function)
		System.out.println("List of names from employee list object");
		List<String> list = empList.stream().map(f->f.getName()).collect(Collectors.toList());
		System.out.println(list);
		
		// forEach(Consumer)
		System.out.println("Print all Record Id");
		empList.stream().map(e -> e.getId()).forEach(c->System.out.println(c));
		
		// sorted(comparable)
		// if we are using sorted() method on custom object 
		// then we have to implements Comparable Interface for the custom class
		// for inbuilt wrapper class it's not required to override compareTo() method
		System.out.println("Natural sorting by Comparable");
		empList.stream().sorted().forEach(e->System.out.println(e));
		
		//sorted(Collections.reverseOrder)
		System.out.println("Natural sorting reverse order");
		empList.stream().sorted(Collections.reverseOrder()).forEach(e->System.out.println(e));
		
		//sorted(Comparator)
		System.out.println("Custom Sorted by Desc salary using Comparator");
		empList.stream().sorted((e1,e2)->(e1.getSalary()<e2.getSalary())? 1 : (e1.getSalary()==e2.getSalary())? 0 : -1).forEach(e->System.out.println(e));

		// Maximum Salary min(Comparator)
		System.out.println("Maximum Salary of Employee");
		Employee employee = empList.stream().max((e1,e2)->(e1.getSalary()<e2.getSalary()?-1:(e1.getSalary()==e2.getSalary())?0:1)).get();
		System.out.println(employee.getName()+" : "+employee.getSalary());
		
		//Minimum Salary min(Comparator)
		System.out.println("Minimum Salary of Employee");
		Employee employee2 = empList.stream().min((e1,e2)->(e1.getSalary()<e2.getSalary()?-1:(e1.getSalary()==e2.getSalary())?0:1)).get();
		System.out.println(employee2.getName()+" : "+employee2.getSalary());
		
		// distinct()
		// if we are using distinct() method on custom object in that object we have to override hashCode() and equals()
		// for inbuilt wrapper class we don't need to object class these methods
		System.out.println("Distinct Record");
		empList.stream().distinct().forEach(e->System.out.println(e));
		
		
		//groupingBy(Function,Collector)
		System.out.println(empList.stream().collect(Collectors.groupingBy(e->e.getName(), Collectors.counting())));
		
		// using SummaryStatistics we can get sum, average, count, min & max etc...
		DoubleSummaryStatistics summaryStatistics = empList.stream().collect(Collectors.summarizingDouble(p->p.getSalary()));
		System.out.println("Sum : "+summaryStatistics.getSum());
		System.out.println("Average : "+summaryStatistics.getAverage());
		System.out.println("Count : "+summaryStatistics.getCount());
		System.out.println("Max : "+summaryStatistics.getMax());
		System.out.println("Min : "+summaryStatistics.getMin());
		
		
		//flatMap(Function) 
		List<String> l1 = new ArrayList<>();
		l1.add("Sachin");
		l1.add("Rohit");
		l1.add("Virat");
		
		List<String> l2 = new ArrayList<>();
		l2.add("Suryakumar");
		l2.add("Hardik");
		
		List<List<String>> l3 = new ArrayList<>();
		l3.add(l1);
		l3.add(l2);
		
		// i/p -> List<List<String>>
		// o/p -> List<String>
		List<String> newList = l3.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(newList);
		
	}

}
