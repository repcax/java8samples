package com.novasolutionsystems.exercicies.java8;

import java.util.Arrays;

// un stream cin números los multiplica x 2 y suma 1
// a esos les saca el promerio y si existe resultado lo imprime
public class Average {

	public static void main(String[] args) {
		Arrays.stream(new int[] {1,2,3})
		.map(n -> n*2+1)
		.average()
		.ifPresent(System.out::println);//5.0
	}

}
