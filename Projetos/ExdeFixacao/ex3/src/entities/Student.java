package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return (nota1 + nota2 + nota3);
	}
	
	public double notaFalta() {
		return 60.0 - notaFinal();
	}
}
