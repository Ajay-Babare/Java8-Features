package com.ajay.lamda;

//It is an interface which has 1 abstract method and 
//it can have any number of static and default methods also
//it should be annotated with @FunctionalInterface

@FunctionalInterface
public interface Test {
	
	public void display();
	
	default void m1(){
		//statement
	}
	default void m2(){
		//statement
	}
	static void m3(){
		//statement
	}
	static void m4(){
		//statement
	}
	
}
