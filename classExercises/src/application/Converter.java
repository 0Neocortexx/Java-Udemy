package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Converter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em dolar para conversão: ");
		double dollar = sc.nextDouble();
		
		System.out.print("Digite a cotação do dolar: ");
		double cotacao = sc.nextDouble();
		
		System.out.printf("Valor a receber em reais = " + CurrencyConverter.converter(cotacao, dollar));
		
		
		sc.close();
	}

}
