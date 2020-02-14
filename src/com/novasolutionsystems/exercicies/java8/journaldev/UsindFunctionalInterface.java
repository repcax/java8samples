package com.novasolutionsystems.exercicies.java8.journaldev;

public class UsindFunctionalInterface {

	public UsindFunctionalInterface() {
	}

	public static void main(String[] args) {
		FunctionalInterface fi = (s) -> System.out.println(s);
		fi.mimetodo("hey");
		/**
		 * Aquí tenemos la implementación de la interface Runnable la cual solamente tiene un único
		 * método, el cuall es "run". Se crea una clase anónima para la implementación del método run
		 */
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Se ejecuta el runnable 1 de forma tradicional");
			}
		};
		//--
		/**
		 * Tenemos otra implementación de Runnable usando lambda Java8
		 * Como es una interface funcional (prque tiene 1 método abstracto) y de un único método
		 * Se usa lambda para impementar si la necesidad de una clase anónima y también sin cocar el 
		 * nombre del método a implementar
		 */
		Runnable r2 = () -> {
			System.out.println("Se ejeuta el runnable 2 sin implementar clase abstracta");
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
