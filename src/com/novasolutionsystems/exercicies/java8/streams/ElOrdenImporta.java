package com.novasolutionsystems.exercicies.java8.streams;

import java.util.stream.Stream;

public class ElOrdenImporta {

	// con el filter se rompe la cedena y si no pasa el filter ya no hace el foreach
	public static void main(String[] args) {
		Stream.of("d2", "a2", "b1", "b3", "c")
		.map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		})
		.filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("A");
		})
		.forEach(System.out::println);
	}
// System.out.println("foreach: " + s);
}
