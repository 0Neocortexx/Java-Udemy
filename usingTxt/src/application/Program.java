package application;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao sistema!");
		System.out.println("Para iniciar seu cadastro insira algumas informações abaixo:");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("CPF (Sem pontos e sem traços): ");
		String cpf = sc.next();
		System.out.print("Data de nascimento: ");
		String date = sc.next();
		Person p = new Person(name,cpf,date);
		write(p);
		System.out.println("Dados escritos!");
	}
	private static void write(Person p) { // Cria uma função privada que não retorna nada
		// Instancia uma classe chamada java.io.file e cria o arquivo de texto
		java.io.File diretorio = new java.io.File("C:\\Users\\jonat\\OneDrive\\Área de Trabalho\\Java\\builders\\src\\txts\\users.txt");
		
		// Verifica se o arquivo txt já existe
		if (diretorio.exists()) {
			System.out.println("O diretorio ja existe!");
		}
		// Inserir dados no arquivo
		try {
			
			// Cria o arquivo fisicamente 
			diretorio.createNewFile();
			
			// Instancia a classe FileWriter para manipular algumas informaçoes do arquivo txt
			// Recebe 2 parametros no contrutor (variável do arquivo ou string e um valor true ou false
			// Se não for escrito nada no valor booleano por padrão será false
			// True significa que vamos reescrever no arquivo sem apagar o que ja foi escrito
			// False diz que ele apagara todo o conteudo do arquivo e reescreverá novamente
			FileWriter fileWriter = new FileWriter(diretorio, true);
			
			// Instanciar a classe printWriter que vai escrever as informações no arquivo
			// No construtor da classe é preciso passar o parametro da classe fileWriter
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Escrever no arquivo usando o printWriter
			printWriter.println(p.getName() + " " + p.getCpf() + " " + p.getDate());
			
			// o "push" do fileWriter
			printWriter.flush();
			
			// Fecha o arquivo
			printWriter.close();
			
		} catch (Exception e) {
            e.printStackTrace();
        }
	}

}
