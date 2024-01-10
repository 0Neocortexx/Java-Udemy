package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class calculateSalary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Write the employee's name: ");
		employee.name = sc.next();
		System.out.print("Write the gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Write the Tax: ");
		employee.tax = sc.nextDouble();
			
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.grossSalary);
		 
		System.out.println("Whith percentage to increase salary?");
		double percentage = sc.nextDouble();
		
		System.out.println("Update data: " + employee.name + ", $ " + employee.increaseSalary(percentage));
		
		sc.close();
	}

}
