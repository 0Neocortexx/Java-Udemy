package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		/*
		 * String[] products = new String[quantity];
		double[] price = new double[quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Digite o nome do produto: ");
			products[i] = sc.next(); 
			System.out.print("Digite o preço do produto: ");
			price[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < quantity; i++) {
			soma += price[i];
		}
		
		double average = soma / quantity;
		
		System.out.printf("A média dos produtos é: %.2f%n",average);*/
		
		
		Products[] vect = new Products[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o nome do produto: ");
			String name = sc.next();
			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();		
			vect[i] = new Products(name, price);
		}
		
		double value = 0.0;
		for (int i = 0; i < vect.length; i++) {
			value += vect[i].getPrice();
		}
		
		double avg = value / vect.length;
		System.out.printf("A média dos produtos é: %.2f%n",avg);
		
		sc.close();

	}
}