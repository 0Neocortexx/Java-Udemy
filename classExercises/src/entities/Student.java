package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculaNota() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if (calculaNota() >= 60) {
			return "Final grade = " + calculaNota() + " PASS";
		} else {
			return "Final grade = " + calculaNota() + " FAILED " + "----" + " Missing " + (60.0 - calculaNota()) + " Points";
		}
	}
}
