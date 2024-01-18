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
			values[i] = sc.nextInt();
		}
		
		int quantpar = 0;
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			if (values[i] % 2 == 0) {
				quantpar++;
				media += values[i];
			} 
		}
		
		if (quantpar !=  0) {
			media = media / quantpar;
			System.out.println("Média dos pares: " + media);
		} else {
			System.out.println("Nenhum número par!");
		}
		
		sc.close();
	}

}
