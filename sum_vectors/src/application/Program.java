package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		double[] vectorA = new double[n];
		double[] vectorB = new double[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vectorA[i] = sc.nextDouble(); 
		}
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vectorB[i] = sc.nextDouble(); 
		}
		
		double[] vectorC = new double[n];
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
			System.out.println(vectorC[i]);
		}
		
		sc.close();

	}

}
