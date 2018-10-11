package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class ProgramInterfaceFuncionalPredicate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/**
		 * Fazer um programa que, a partir de uma lista de produtos, remova da lista
		 * somente aqueles cujo preço mínimo seja menor que 100.
		 */
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));

		/*
		 * - 01: Trabalhando com a interface Funcional Predicate, utilizando Expressão
		 * Lambda list.removeIf(p -> p.getPrice() >= 100);
		 */

		/*
		 * - 02: Vamos criar uma classe que implementa Predicate e instanciá-la na
		 * função removeIf. O Resultado será o igual a linha que utilizou a expressão
		 * lambda
		 * 
		 */
		list.removeIf(new ProductPredicate());
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
