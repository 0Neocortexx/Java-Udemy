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
		
		double maior = values[0];
		double posmaior = 0;
		
		for (int i = 1; i < n; i++) {
			if (values[i] > maior) {
				maior = values[i];
				posmaior = i;
			}
		}
		System.out.printf("MAIOR VALOR: %.1f%n", maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR: " + posmaior);
		
		sc.close();

	}

}
