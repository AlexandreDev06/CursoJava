import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		String dia = "";

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();

	 	switch (x) {
		case 1:
			dia = "domingo";
			break;

		case 2:
			dia = "segunda";
			break;

		case 3:
			dia = "ter�a";
			break;

		case 4:
			dia = "quarta";
			break;

		case 5:
			dia = "quinta";
			break;

		case 6:
			dia = "sexta";
			break;

		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor incorreto";
			break;
		}

		System.out.println("Hoje � " + dia);
		sc.close();
		
		
		/*
		 * EXEMPLO DE CONDI��O TERNARIA double preco = 34.5; double desconto = (preco <
		 * 20.0) ? preco * 0.1 : preco * 0.05;
		 */

	}

}
