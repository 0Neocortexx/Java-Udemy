package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] values = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			values[i] = sc.nextDouble();
		}
		
		double total = 0.0;
		
		System.out.print("Valores: " );
		for (int i = 0; i < n; i++) {
			total += values[i];
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.printf("Soma: %.2f%n", total);
		System.out.printf("Média: %.2f%n", (total / n));
		
		sc.close();
	}

}
