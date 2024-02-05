package application;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");

		System.out.print("Number: ");
		int number = sc.nextInt();

		System.out.print("Holder: ");
		String holder = sc.next();
		sc.nextLine();

		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();

		Account account = new Account(number, holder, initialBalance, limit);

		System.out.println();
		
		try {
			
			System.out.print("Enter amount for withdraw: ");
			account.withDraw(sc.nextDouble());
			System.out.println("New Balance: " + account.getBalance());

		} catch (DomainException e) {
			
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
