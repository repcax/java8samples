package com.novasolutionsystems.exercicies.java8.journaldev;

public interface Interface1 {
	
	void method1(String str);
	
	default void log(String str) {
		System.out.println("I1 logging::"+str);
	}
}
