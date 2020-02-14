package com.novasolutionsystems.exercicies.java8.journaldev;
/**
 * Interface funcional
 * Para que sea funcional debe tener un método abstract, es decir, sin implementación. Diferente
 * de default y static
 * para ser usada como lambda, el étodo debe tener parámetros que hagan match con la llamada lambda
 * 
 * @author Julio Quiroz
 *
 */
public interface FunctionalInterface {
	/**
	 * La interface ya es funcional por este método abstracto (sin implementar)
	 * @param a es un parámetro cualquiera
	 */
	void functionalCuz1AbstractMethod(Object a);
	
	default void mimetodo(String str) {
		System.out.println("Intercae::mimetodo: " + str);
	}
}
