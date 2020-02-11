package com.novasolutionsystems.exercicies.java8;

import java.util.Arrays;
import java.util.List;

public class MapToInt {

	// imprime los lenghts de cada elemento de la lista
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("12345", "54321", "123", "321");

		lista.stream().mapToInt(str->str.length()).forEach(System.out::println); ;
		
	}

}
