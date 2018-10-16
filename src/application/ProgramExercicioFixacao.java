package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class ProgramExercicioFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter full file path: "); // C:\ASChaves\JAVA\temp\employees.csv
		String path = sc.nextLine();

		List<Employee> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.println("Enter salary: ");
			double sal = sc.nextDouble();
			System.out.println(String.format("Email of people whose salary is more than %.2f", sal));

			List<String> email = list.stream().filter(e -> e.getSalary() > sal).map(e -> e.getEmail()).sorted()
					.collect(Collectors.toList());

			email.forEach(System.out::println);

			double sum = list.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0,
					(x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
