package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class ProgramInterfaceFuncionalFunction {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/**
		 * Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista
		 * contendo os nomes dos produtos em caixa alta.
		 * 
		 */
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));

		/*
		 * função "map" (não confunda com a estrutura de dados Map) é uma função que
		 * aplica uma função a todos elementos de uma stream.
		 */

		/*
		 * - 1: Implementação da interface
		 * 
		 * list.stream().map(new ProductFunction()).collect(Collectors.toList());
		 */

		/*
		 * - 2: Reference method com método estático
		 * 
		 * list.stream().map(Product::staticProductFunction).collect(Collectors.toList()
		 * );
		 */

		/*
		 * - 3: Reference method com método não estático
		 * 
		 * list.stream().map(Product::nonStaticProductFunction).collect(Collectors.
		 * toList());
		 */

		/*
		 * - 4: Expressão lambda declarada
		 */

		Function<Product, String> fun = p -> p.getName().toUpperCase();

		List<String> names = list.stream().map(fun).collect(Collectors.toList());

		names.forEach(System.out::println);
	}

}
