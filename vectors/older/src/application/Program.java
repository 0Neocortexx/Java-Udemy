package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		String[] names = new String[n];
		int[] ages =  new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %sa pessoa: \n", i+1);
			System.out.print("Nome: ");
			names[i] = sc.next();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
		}
		
		int older = ages[0];
		String older_name = "";
		for (int i = 0; i < n; i++) {
			if (ages[i] > older) {
				older = ages[i];
				older_name = names[i];
			}
		}
		
		System.out.println("Pessoa mais velha: " + older_name);
		
		sc.close();

	}

}
