package entities;

public class OutsourcedEmployee extends Employee {
	private Double addictionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addictionalCharge) {
		super(name, hours, valuePerHour);
		this.addictionalCharge = addictionalCharge;
	}

	public Double getAddictionalCharge() {
		return addictionalCharge;
	}

	public void setAddictionalCharge(Double addictionalCharge) {
		this.addictionalCharge = addictionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + addictionalCharge * 1.1;
	}
}
