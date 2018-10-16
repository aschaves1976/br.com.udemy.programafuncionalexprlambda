package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPipeline {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		System.out.println("Conteúdo da lista:");
		for (Integer i : list) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nConteúdo da lista multiplicado por 10:  utilizando a operação intermediária reduce");
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		// fazer um somatorio dos valores da lista
		System.out.println("\nSomatório do Conteúdo da lista:  utilizando a operação final reduce");
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum);

		System.out.println("\nMultplicação do Conteúdo da lista: utilizando a operação final reduce");
		int mult = list.stream().reduce(1, (x, y) -> x * y);
		System.out.println(mult);

		System.out.println("\nUtilizando Pipeline: filtrar os elementos pares da lista e multiplica-los por 10");
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
