package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "c:\\temp\\pessoas.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		List<Employee> array = new ArrayList<>();
		
		String employeeCSV = br.readLine();
		
		while(employeeCSV != null) {
			String[] data = employeeCSV.split(",");
			array.add(new Employee(data[0], Double.parseDouble(data[1])));
			employeeCSV = br.readLine();
		}
		
		Collections.sort(array);
		
		for (Employee e  : array) {
			System.out.println(e.getName()+ ", " + e.getSalary());
		}
		
		sc.close();
	}

}
