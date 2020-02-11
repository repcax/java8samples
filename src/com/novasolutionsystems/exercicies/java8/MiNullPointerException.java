package com.novasolutionsystems.exercicies.java8;

import java.util.stream.Stream;

public class MiNullPointerException {

	public MiNullPointerException() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("a","b")
		.map(s -> {
			//Integer.valueOf(s);
			System.out.println(s);
			return s.toUpperCase();
		});
		
	}

}
