package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Person[] p = new Person[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %sa pessoa: \n",i+1);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			p[i] = new Person(name, age, height);
		}
		
		double heights = 0.0;
		
		int[] ages = new int[n];
		int valid = 0;
		
		for (int i = 0; i < n; i++) {
			heights += p[i].getHeight();
			ages[i] = p[i].getAge();
			if (ages[i] < 16) {
				valid++;
			}
		}
	
		heights = heights / n;
		double rest = (valid / (double)n) * 100.0;
		
 		System.out.printf("Altura média: %.2f%n", heights);
		System.out.println("Pessoas com menos de 16 anos: " + rest + "%");
		
		for (int i = 0; i < n; i++) {
			if (p[i].getAge() < 16) {
				System.out.println(p[i].getName());
			}
		}
		
		
		sc.close();
	}

}
