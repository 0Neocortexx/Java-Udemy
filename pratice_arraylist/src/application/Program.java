package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> array = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%s \n", i + 1);
			
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee e = new Employee(id,name,salary);
			
			array.add(e);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = array.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not existis!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increase(percentage);
		}

		System.out.println("List of employees: ");
		
		for(Employee e : array) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	public Employee getId(ArrayList<Employee> e, int id) {
		for (Employee employee : e) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}
	
}
