package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Person[] array = new Person[n]; // Declarando a lista de objetos 
		
		for (int i = 0; i < n; i++) {
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.println("Nome: ");
			String nome = sc.next();
			sc.nextLine();
			System.out.println("CPF: ");
			String cpf = sc.next();
			sc.nextLine();
			
			array[i] = new Person(id, nome, cpf);
			
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		
		System.out.print("Digite o ID desejado: ");
		Person resultado = spotobject(array, sc.nextInt()); 
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		
		sc.close();
	}
	
	public static Person spotobject(Person[] itemLista, int id) {
		for (Person po : itemLista) {
			if (po != null && po.getId() == id) {
				return po;
			}
		}
		return null;
	}

}
