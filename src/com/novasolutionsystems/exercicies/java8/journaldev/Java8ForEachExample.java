package com.novasolutionsystems.exercicies.java8.journaldev;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.novasolutionsystems.exercicies.java8.pojo.MiUser;
// https://www.journaldev.com/2389/java-8-features-with-examples#iterable-forEach
public class Java8ForEachExample {

	public Java8ForEachExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<MiUser> users = Arrays.asList(new MiUser("Julio","Quiroz"), new MiUser("Victor", "Partida"));
		users.forEach(new Consumer<MiUser>() {
			@Override
			public void accept(MiUser t) {
				System.out.println( t.getNombre() + " " + t.getApellido() );
			}
		});
		
		//Objects.requireNonNull(null,"no mamesn null");
	}

}
