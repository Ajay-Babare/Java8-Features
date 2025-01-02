package com.ajay.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Sachin",100000));
		empList.add(new Employee(2,"Dhoni",200000));
		empList.add(new Employee(3,"Virat",300000));
		empList.add(new Employee(4,"Suryakumar",400000));
		empList.add(new Employee(5,"Hardik",500000));
		
		empList.stream().filter(p->p.getName().startsWith("S")).forEach(c->System.out.println(c.getName()));
		
		List<String> list = empList.stream().map(f->f.getName()).collect(Collectors.toList());
		System.out.println(list);
		
		Set<Integer> collect = empList.stream().map(e -> e.getId()).collect(Collectors.toSet());
		System.out.println(collect);
		
	}

}
