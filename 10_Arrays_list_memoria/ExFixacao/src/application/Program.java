package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0, a = 1; i < n; i++, a++) {
			System.out.println();
			sc.nextLine();

			System.out.println("Rent #" + a + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			vect[room] = new Rent(name, email, room);
		}
		System.out.println("Busy rooms:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
