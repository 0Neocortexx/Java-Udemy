package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Rent[] r = new Rent[10];
		
		int room = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("Rent #%s: \n", i);
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			
			r[room] = new Rent(name, email);
		}
	
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10	; i++) {
			if (r[i] != null) {
			System.out.printf("%s: %s \n", i,r[i]);
		}
	}
		
		sc.close();

	}

}
