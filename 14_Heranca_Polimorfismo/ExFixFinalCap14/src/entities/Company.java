package entities;

public class Company extends TaxPlayer {

	private Integer numberOfEmployees;

	public Company() {
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double total = 0.0;
		if (numberOfEmployees > 10) {
			total = getAnualIncome() * 0.14;
		} else {
			total = getAnualIncome() * 0.16;
		}
		return total;
	}

}
