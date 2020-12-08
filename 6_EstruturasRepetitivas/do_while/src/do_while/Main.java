package do_while;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double c, f;
		char resp;

		do {
			System.out.printf("Digite a temperatura em celsius: ");
			c = sc.nextDouble();
			f = 9.0 * c / 5.0 + 32.0;

			System.out.printf("Equivalente em Fahrenheit: %.2f\n", f);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
		System.out.println("Programa finalizado");

	}

}
