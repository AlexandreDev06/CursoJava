package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		Employee func = new Employee();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int resposta = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == resposta).findFirst().orElse(null);

		if (emp == null) {

			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.incraseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employoees:");
		for (Employee obj : list) {
			System.out.print(obj);
		}

		sc.close();
	}
}
