package com.novasolutionsystems.exercicies.java8.journaldev;

import java.util.LinkedList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/arraylist-removeif-method-in-java/
 * @author Julio Quiroz
 *
 */
public class RemoveIfSample {

	public RemoveIfSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> numeros = new LinkedList<Integer>();
		//llenamos la lista
		for(int i=0;i<26;i++)numeros.add(i);
		System.out.println("Vamos a filtrar los númeos que no son divisibles por 5");
		//quitamos los números que se dividen por 5
		numeros.removeIf(n -> (n%5==0));
		System.out.println(numeros);
	}

}
