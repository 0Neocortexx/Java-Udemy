package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter departament's name: ");
		String departmentName = sc.next();
		sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.next();
		sc.nextLine();
		
		System.out.print("Level: ");
		String workLevel = sc.next();
		sc.nextLine();
		
		System.out.print("Base salary: ");
		Double workerBaseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkLevel.valueOf(workLevel), workerBaseSalary, new Departament(departmentName));
		
		System.out.print("How many contracts to this worker: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #"+ i +" data: ");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractData = sdf.parse(sc.next());	
			
			System.out.print("Value per hour: ");
			double contractValuePerHour = sc.nextDouble();
			
			System.out.print("Duration(Hours): ");
			int contractDuration = sc.nextInt();

			HourContract contract = new HourContract(contractData, contractValuePerHour, contractDuration);
			worker.addContratc(contract);	
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndyear = sc.next();
		double month = Double.parseDouble(monthAndyear.substring(0,2));
		double year = Double.parseDouble(monthAndyear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndyear + ": " + String.format("%.2f",worker.income((int)year, (int)month)));
		
		sc.close();
	}
}
