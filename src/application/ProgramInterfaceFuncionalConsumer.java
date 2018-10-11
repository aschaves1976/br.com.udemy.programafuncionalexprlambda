package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductConsumer;

public class ProgramInterfaceFuncionalConsumer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/**
		 * Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos
		 * produtos em 10%.
		 * 
		 */
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));

		/*
		 * - 1: Implementação da interface
		 * 
		 * list.forEach(new ProductConsumer());
		 */

		/*
		 * - 2: Reference method com método estático
		 * 
		 * list.forEach(Product::staticProductConsumer);
		 */

		/*
		 * - 3: Reference method com método não estático
		 */

		list.forEach(Product::nonStaticProductConsumer);

		list.forEach(System.out::println);
	}

}
