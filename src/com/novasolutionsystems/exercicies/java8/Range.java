package com.novasolutionsystems.exercicies.java8;

import java.util.stream.IntStream;

// crea una lista de números usando range y los imprime
public class Range {

	public static void main(String[] args) {
		IntStream.range(1, 101)
	    .forEach(System.out::println);
	}

}
