package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circumFerence(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();

	}

}
/*PARTE 1 -  SEM CLASSES
 * public class Program {
 * 
 * public static final double PI = 3.141549;
 * 
 * public static void main(String[] args) { Locale.setDefault(Locale.US);
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter radius: "); double radius = sc.nextDouble();
 * 
 * double c = circumFerence(radius);
 * 
 * double v = volume(radius);
 * 
 * System.out.printf("Circumference: %.2f%n", c);
 * System.out.printf("Volume: %.2f%n", v); System.out.printf("PI value: %.2f%n",
 * PI);
 * 
 * sc.close();
 * 
 * }
 * 
 * public static double circumFerence(double radius) { return 2.0 * PI * radius;
 * }
 * 
 * public static double volume(double radius) { return 4.0 * PI * radius *
 * radius * radius / 3.0; } }
 */