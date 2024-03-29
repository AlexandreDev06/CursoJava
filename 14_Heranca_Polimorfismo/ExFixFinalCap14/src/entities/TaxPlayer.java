package entities;

public abstract class TaxPlayer {
	private String name;
	private Double anualIncome;

	public TaxPlayer() {
		super();
	}

	public TaxPlayer(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract double tax();

	public String toString() {
		return getName() + ": $ " + String.format("%.2f", tax());
	}
}
