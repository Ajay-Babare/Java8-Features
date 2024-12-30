package com.ajay.interfacechanges;

public interface Test {
	public void show();
	
	// Backward compatibility
	// Default method allow interface to evolve without breaking existing implementation
	// We can override default methods to provide custom behavior
	// If multiple interface provide conflicting default methods(same name), the implementation class must resolve the conflict 
	default void display() {
		System.out.println("Test Interface default Method - display()");
	}
	
	// Utility methods or null checks(can remove utility classes like Collections)
	// can not override in implementation classes
	// It provides the security by not allowing implementation classes to override them
	static void sample() {
		System.out.println("Test Interface static Method - sample()");
	}
}
