package entities;

public class Retangulo {
	public double width;
	public double height;

	public double Area() {
		return width * height;
	}

	public double Perimeter() {
		return (width + height) * 2.0;
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}