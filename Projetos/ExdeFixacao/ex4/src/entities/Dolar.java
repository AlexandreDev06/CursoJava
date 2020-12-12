package entities;

public class Dolar {
	public static double valor;
	public static double quant;
	public static double total;
	
	public static double CurrencyConverter() {
		total = (valor * quant) / 100;
		return (valor * quant) + (total * 6);
	}
}
