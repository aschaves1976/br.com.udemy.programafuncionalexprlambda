package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class ProgramExperienciaComparator {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		/**
		 * - 01 1 - Vamos ignorar a classe MyComparator(); 2 - Vamos declarar uma
		 * variável do tipo Comparator, utilizando uma sintaxe de classe anônima;
		 * 
		 * 
		 * /* Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { // TODO Auto-generated
		 *           method stub return
		 *           p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); }
		 * 
		 *           };
		 */

		/**
		 * - 02 A utilização da classe anônima, da forma como foi implementada, ficou
		 * muito grande, muito verbosa. Vamos utilizar Expressões Lambda - que é uma
		 * função anônima -, para deixar a declaração da classe mais enxuta.
		 *
		 * Comparator<Product> comp = (p1, p2) -> { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); };
		 */

		/**
		 * - 03 Melhorando a sintaxe.
		 */
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		// list.sort(new MyComparator());
		list.sort(comp);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
