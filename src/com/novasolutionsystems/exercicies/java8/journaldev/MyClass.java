package com.novasolutionsystems.exercicies.java8.journaldev;

public class MyClass implements Interface1, Interface2 {

	public MyClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub

	}

	/**
	 * Al estar implementando más de una interface y las dos tienen una firma de método idéntica como default
	 * entonces debo llamar a algún super de método, ya sea interface 1 o 2 y así el compilador sabrá 
	 * de qué tipo de interfce es esta implementación
	 */
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::"+str);
		Interface1.super.log(str);
	}
	
	public static void main(String[] args) {
		Interface1 mc = new MyClass();
		mc.log("hey");
	}

}
