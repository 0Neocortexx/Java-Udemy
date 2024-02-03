package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// List<int> list; a classe lista nao aceita tipos primitivo como tipo de lista
		List<String> list = new ArrayList<>(); // Utiliza-se a wrapper class integer
		list.add("Maria"); // Adiciona na lista
		list.add("Bob");
		list.add("Ana");
		list.add("Alex");
		list.add(2, "Marcos");	// Adiciona em uma posição da lista
		
		for (String a : list) { // For each
			System.out.println(a);
		}
		System.out.println("--------------------");
		System.out.println(list.size()); // Vê o tamanho da lista

		list.remove("Ana"); // Remove um objeto especifico da lista
		list.remove(1); // Remove em uma posição da lista
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove todos cujo caractere iniciar ou na posição 0 seja M
	
		for (String a : list) {
			System.out.println(a);
		}
		list.add("Maria");
		list.add("Bob");
		list.add("Ana");
		System.out.println("--------------------");
		System.out.println("Index of Alex: "+ list.indexOf("Bob")); // acha a posição de algum elemento
		// OBS: Quando o indexOf nao encontra o elemento ele retorna -1
	
		for (String a : list) {
			System.out.println(a);
		}
		System.out.println("--------------------");
		// Filter recebe um predicado
		// Stream do java8++ aceita expressoes Lambda
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String a : result) {
			System.out.println(a);
		}
	
		System.out.println("--------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
