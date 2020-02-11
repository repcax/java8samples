package com.novasolutionsystems.exercicies.java8;

import java.util.List;
import java.util.stream.Stream;

// El anyMatch deja de recorrer el stream hasta qu hay un match
public class AnyMatch {

	public static void main(String[] args) {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
	}

}
