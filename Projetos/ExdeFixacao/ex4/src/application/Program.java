package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		Dolar.valor = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		Dolar.quant = sc.nextDouble();

		System.out.printf("Amount to be paid in reias = %.2f%n", Dolar.CurrencyConverter());
	}

}
