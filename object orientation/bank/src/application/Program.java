package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Person p;
		
		System.out.println("Bem vindo ao JhonBank!");
		System.out.println("Para dar inicio precisamos que preencha algumas informações: ");

		System.out.print("Nome completo: ");
		String name = sc.nextLine();

		System.out.print("Um numero para sua conta (4 caracteres): ");
		int account_number = sc.nextInt();

		System.out.print("Deseja adicionar algum valor inicial na conta? (S/N): ");
		char confere = sc.next().charAt(0);

		if (confere == 's') {
			System.out.print("Informe o valor que deseja adicionar: ");
			double value = sc.nextDouble();
			p = new Person(name, account_number, value);
		} else {
			p = new Person(name, account_number);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(p);

		System.out.println();
		System.out.println("Entre com o valor do depósito: ");
		double deposit = sc.nextDouble();
		p.deposit(deposit);

		System.out.println("Account data: ");
		System.out.println(p);

		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		p.saque(saque);

		System.out.println("Account data: ");
		System.out.println(p);

		sc.close();

	}

}
