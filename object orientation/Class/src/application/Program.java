package application;

import java.util.*;
import entities.Car;

public class Program {

	public static void main(String[] args) {
		// Criar o Scanner
		Scanner sc = new Scanner(System.in);
		
		Car a;
		
		a = new Car();
		
		System.out.print("Digite o modelo do carro: ");
		a.modelo = sc.next();
		System.out.print("Digite a placa do carro: ");
		a.placa = sc.next();
		System.out.print("Digite o ano do carro: ");
		a.ano = sc.nextInt();
		
		
		System.out.println("O carro é de modelo " + a.modelo + " com a placa " + a.placa + " e o ano " + a.ano );
		
		sc.close(); // Fecha Scanner
	}

}
