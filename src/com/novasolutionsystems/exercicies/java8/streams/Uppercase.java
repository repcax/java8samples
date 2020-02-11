package com.novasolutionsystems.exercicies.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// filtra los que inician con c, a ellos les ace upperCase, después los ordena
// y al final los imprime
public class Uppercase {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).
		sorted().forEach(System.out::println);
		
	}

}
