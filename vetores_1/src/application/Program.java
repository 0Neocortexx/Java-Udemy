package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas: ");
		int x = sc.nextInt();
		
		double[] vect = new double[x];
		
		for (int i = 0; i < x; i++) {
			System.out.println("Digite a altura da pessoa "+ i + ": ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<x;i++) {
			soma += vect[i];
		}
		
		double avg = soma / x;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n",avg);
		
		sc.close();
	}

}
