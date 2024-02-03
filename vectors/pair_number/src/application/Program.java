package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] values = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			values[i] = sc.nextInt();
		}
		int list_pair = 0;
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if (values[i] % 2 == 0) {
				System.out.print(values[i] + "  ");
				list_pair++;
			}
			
		}
		System.out.println();
		System.out.println("Quantidade de pares = " + list_pair);
		
		sc.close();
	}

}
