import java.util.Locale;

public class udmPrint {

	public static void main(String[] args) {
		String product1 = "Computer", product2 = "Office desk";
		int age = 30, code = 5290;
		char gender = 'f';
		double price1 = 2100.0, price2 = 650.0, measure = 53.234567;

		System.out.print("Products:\n" + product1 + ", which price is $ " + price1 + "\n" + product2
				+ ", which price is $ " + price2);
		System.out.print("\n\n");
		System.out.print("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.print("\n\n");
		System.out.printf("Measue eith eight decimal places: %f\nRouded (three decimal places): %.2f\n", measure,measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

		/*
		 * double x = 10.34340, renda = 2100; String nome = "Maria"; int idade = 21;
		 * 
		 * System.out.println(x); System.out.printf("%.2f%n", x);
		 * System.out.printf("%.4f%n", x); Locale.setDefault(Locale.US);
		 * System.out.printf("%.4f%n", x);
		 * 
		 * System.out.println("Resultado = " + x + " Metros");
		 * System.out.printf("Resultado = %f Metros\n", x);
		 */
	}

}
