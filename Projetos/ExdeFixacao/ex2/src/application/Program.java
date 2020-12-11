package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();

		System.out.print("Name: ");
		funcionario.name = sc.nextLine();

		System.out.print("Gross salary: ");
		funcionario.GrossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();

		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", funcionario.name, funcionario.NetSalary());

		System.out.println("Which percentage to increase salaray?");
		double percentage = sc.nextDouble();
		funcionario.IncreseSalary(percentage);

		System.out.printf("Updated data: %s, $ %.2f%n", funcionario.name, funcionario.GrossSalary);

		sc.close();

	}

}
// incompleto