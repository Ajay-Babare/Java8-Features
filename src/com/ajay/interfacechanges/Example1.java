package com.ajay.interfacechanges;

public class Example1 implements Test {

	@Override
	public void show() {
		System.out.println("Example 1 - Show Method");
	}
	
	public void displayDefault() {
		// InterfaceName.super.defaultMethodName();
		Test.super.display();
	}
	
	public static void main(String args[]) {
		Example1 obj = new Example1();
		// This will call the abstract method implementation
		obj.show();
		
		// static method can call using 
		// InterfaceName.staticMethodName();
		Test.sample();
		
		// default method call by using utility method
		obj.displayDefault();	
		
	}
}
