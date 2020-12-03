package Main;

public class Main {

	public static void main(String[] args) {
		double x = 3.0, y = 4.0, z = -5.0, A, B, C;

		A = Math.sqrt(x); // raiz quadrada
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		System.out.printf("\n");
		
		A = Math.pow(x, y); // potenciação
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		System.out.printf("\n");

		A = Math.abs(y);
		B = Math.abs(z);// valor absoluto
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}
