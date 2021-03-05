package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.excepetions.DomainExceptions;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account ac = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double ammount = sc.nextDouble();
			ac.withdraw(ammount);

			System.out.println("New balance: " + String.format("%.2f", ac.getBalance()));
			
		} catch (DomainExceptions msg) {
			System.out.println("Withdraw error: " + msg.getMessage());
		}
		sc.close();
	}
}
