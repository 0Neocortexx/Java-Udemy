package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class calculateStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Entre com o nome do aluno: ");
		student.name = sc.next();
		
		System.out.println("Entre com as 3 notas do aluno: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}

}
