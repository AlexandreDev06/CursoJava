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
		String resposta = sc.nextLine();
		
		Cliente cliente = new Cliente(numberAcount, name);

			if (resposta == "y")
				System.out.print("Enter initial deposit value: ");
		// AGORA A PARTE DOS DADOS
		System.out.println("Account data: ");
		System.out.printf("Account %s, Holder: %s, Balance: $ %.2f", numberAcount, name, cliente.saldo);

	}

}
