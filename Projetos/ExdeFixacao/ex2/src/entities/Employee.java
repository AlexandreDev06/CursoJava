package entities;

public class Employee {
	public String name;
	public double GrossSalary;
	public double tax;
	
	public double NetSalary() {
		return GrossSalary - tax;
	}
	
	public void IncreseSalary(double percentage) {
		this.GrossSalary = (GrossSalary / percentage) * 100;
	}
}