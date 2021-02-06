package entities;

public class SavingsAccountPlus extends SavingsAccount {
	@Override
	public void withDraw(double amount) {
		balance -= amount + 2.0;
	}
}
