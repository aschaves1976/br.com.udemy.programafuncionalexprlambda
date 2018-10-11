package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

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
		 * 
		 * list.removeIf(new ProductPredicate());
		 */

		/*
		 * - 03: Trabalhando com um método estático dentro da classe Product(), que irá
		 * implementar o mesmo código boolean. Ao utilizar este método na função
		 * removeIf() estaremos trabalhando com Method Reference com método Estático.
		 * 
		 * 
		 * 
		 * list.removeIf(Product::staticProductPredicate); // <- esta sintaxe é que se
		 * chama de Method Reference
		 */

		/*
		 * - 04: Reference Method com método não estático
		 * 
		 */

		list.removeIf(Product::nonStaticProductPredicate); // <- esta sintaxe é que se chama de Method Reference

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
