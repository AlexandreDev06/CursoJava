package entities;

public class Individual extends TaxPlayer {

	private Double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double total = 0.0;
		if (getAnualIncome() < 20000) {
			total =  (getAnualIncome() * 0.15);
		} else {
			total =  (getAnualIncome() * 0.25);
		}

		if (healthExpenditures > 0) {
			total = total - (getHealthExpenditures() * 0.50);
		}
		return total;
	}

}
