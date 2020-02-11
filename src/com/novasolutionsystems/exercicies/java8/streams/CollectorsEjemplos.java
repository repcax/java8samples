package com.novasolutionsystems.exercicies.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CollectorsEjemplos {

	private List<Person> persons;

	public CollectorsEjemplos(int nbrEjercicio) {
		setUpData();
		switch (nbrEjercicio) {
		case 1:
			doWork_CollectorsToList();
			break;
		case 2:
			doWork_groupingBy();
			break;
		default:
			break;
		}

	}
	/**
	 * de un stream después de ejecutar funciones sobre ésta, como filtrar, 
	 * regresa una lista con los filtrados solamente
	 * 
	 */
	public void doWork_CollectorsToList() {
		List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P"))
				.collect(Collectors.toList());

		System.out.println(filtered);
	}
	/**
	 * De u steam usando collect y Collectors para agrupar por el un campo del objeto que representa
	 * Reliza un groupby como su fuese sql
	 */
	public void doWork_groupingBy() {
		
		Map<Integer, List<Person>> personsByAge = 
				persons.stream()
				//.sorted((s1,s2) -> Integer.valueOf(s2.getAge()).compareTo(s2.getAge())  )
				.collect(Collectors.groupingBy(p -> p.getAge()));
		
		personsByAge
		.forEach((age, listaOfPeople) -> System.out.format("age %s: %s\n", age, listaOfPeople));
	}
	
	
	
	
	

	private void setUpData() {
		persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));
	}

	public static void main(String[] args) {
		CollectorsEjemplos c = new CollectorsEjemplos(2);
	}

	class Person {
		public String name;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return name;
		}
	}

}
