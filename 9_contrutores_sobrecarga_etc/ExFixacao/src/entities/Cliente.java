package entities;

public class Cliente {
	public String name;
	public String numberAcount;
	public double saldo;
	public double deposito;
	public double saque;

	public Cliente() {
	}

	public Cliente(String name, String numberAcount) {
		this.name = name;
		this.numberAcount = numberAcount;
	}

	public double deposit() {
		return saldo = saldo + deposito;
	}

	public double saque() {
		return saldo =  (saldo - saque) - 5;
	}

}
