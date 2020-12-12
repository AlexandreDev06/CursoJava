package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	// SOBRECARGA
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// FIM DA SOBRE CARGA
	// SOBRE CARGA É TER MAIS DE UM CONSTRUTOR EM APENAS UM OBJETO, PARA QUE POSSA INSTACIAR CONSTRUTORES DIFERENTES
	
	// PEGANDO VALORES COM O PRIVANTE NAS VARIAVEIS
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	// FIM DOS SET E GET
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
