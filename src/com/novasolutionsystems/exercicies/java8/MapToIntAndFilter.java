package com.novasolutionsystems.exercicies.java8;

import java.util.Arrays;
import java.util.List;

public class MapToIntAndFilter {

	// imprime los números divisibles por 5 (ie módulo 5)
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("12345", "54321", "123", "321");
		lista.stream().mapToInt(s -> Integer.parseInt(s)).filter(s -> s % 5 == 0).forEach(System.out::println);
		;
	}

}
