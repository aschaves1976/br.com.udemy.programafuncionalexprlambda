package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import service.ProductService;

public class ProgramCriarFuncaoRecebeFuncao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/**
		 * Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos
		 * preços somente dos produtos cujo nome começa com "T".
		 * 
		 */
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));

		System.out.println("Informe uma Letra: ");
		String letra = sc.nextLine();

		ProductService ps = new ProductService();

		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == letra.charAt(0));
		System.out.println(String.format("Sum = %.2f ", sum));

		System.out.println("Informe um valor: ");
		double amount = sc.nextDouble();

		sum = ps.filteredSum(list, p -> p.getPrice() >= amount);
		System.out.println(String.format("Sum = %.2f ", sum));
	}

}
