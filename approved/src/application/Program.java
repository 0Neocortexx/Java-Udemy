package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serãp informados? ");
		int n = sc.nextInt();
		
		sc.nextLine(); // Consumir a quebra de linha pendente
		
		Student[] s = new Student[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %so aluno: \n", i+1);
			String name  = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			s[i] = new Student(name, nota1, nota2);	
			sc.nextLine(); // Consumir a quebra de linha pendente
		}
		
		System.out.println("Alunos Aprovados: ");
		for (int i = 0; i < n; i++) {
			if ((s[i].getNota1() + s[i].getNota2()) / 2 >= 6) {
				System.out.println(s[i].getName());
			}
		}
		
		sc.close();

	}

}
