package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_produto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Configuração para o numero double
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt(); 
		
		/* Quando criado um método toString no arquivo da classe
		 * quando houver um print com a classe, ele retornara o toString*/
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the numbers of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the numbers of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		sc.close();
	}

}
