package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String numberAcount = sc.nextLine();

		System.out.print("Enter account holder: ");
		String name = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);

		Cliente cliente = new Cliente(numberAcount, name);

		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			cliente.saldo = sc.nextDouble();
		}

		// AGORA A PARTE DOS DADOS
		System.out.println();
		System.out.println("Account data: ");
		System.out.printf("Account %s, Holder: %s, Balance: $ %.2f%n", numberAcount, name, cliente.saldo);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		cliente.deposito = sc.nextDouble();
		double x = cliente.deposit();
		System.out.println("Updated account data: ");
		System.out.printf("Account %s, Holder: %s, Balance: $ %.2f%n", numberAcount, name, cliente.saldo);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		cliente.saque = sc.nextDouble();
		double y = cliente.saque();
		System.out.println("Updated account data: ");
		System.out.printf("Account %s, Holder: %s, Balance: $ %.2f", numberAcount, name, cliente.saldo);

	}

}
