package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public double increaseSalary(double percent) {
		return (netSalary() + (grossSalary * (percent / 100)));
	}
}
