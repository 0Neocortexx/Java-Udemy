package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import util.CommitTxt;
import util.Filters;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		menu();
		
		int option = sc.nextInt();
		
		while (option != 3) {
			
			if (option == 1) { // Se a opção for 1
				System.out.println("In development");
			}
			else if (option == 2) {
				// Interface
				System.out.println("Bem vindo ao sistema de cadastros do JhonBank!");
				System.out.println("Para começarmos vamos precisar de alguns dados!");

				// Recebe nome
				System.out.print("Nome: ");
				String name = sc.next();
				sc.nextLine();

				// Recebe data de nascimento
				System.out.print("Data de nascimento: ");
				String data = sc.next();
				sc.nextLine();
				
				// recebe CPF
				System.out.print("CPF: ");
				String cpf = sc.next();
				sc.nextLine();

				// Recebe email
				System.out.print("Email: ");
				String email = sc.next().toLowerCase();
				boolean check_email = Filters.validaEmail(email);

				// Filtro de email
				while (check_email != true) {
					System.out.println("Email inválido! Digite um email válido!");
					System.out.print("Digite um email válido: ");
					email = sc.next().toLowerCase();
					check_email = Filters.validaEmail(email);
				}

				// Recebe senha
				System.out.print("Defina uma senha: ");
				String account_password = sc.next();
				sc.nextLine();
				String check_password = Filters.validaSenha(account_password);

				// Filtro de senha
				while (check_password != "sv") { // Enquanto a senha for diferente de sv(senha válida)
					if (check_password == "pc") {
						System.out.println("Por favor, digite uma senha que possua mais que 8 caracteres.");
						System.out.print("Defina uma senha: ");
						account_password = sc.next();
						check_password = Filters.validaSenha(account_password);
					} else if (check_password == "sc") {
						System.out.println("Por favor, digite uma senha que possua caracteres especiais.");
						System.out.print("Digite uma senha: ");
						account_password = sc.next();
						check_password = Filters.validaSenha(account_password);
					}
				}
				
				// Gera número da conta aleatória e senha do cartão aleatória
				int account_number = Filters.geraConta();
				int card_password = Filters.geraSenha();
				
				// Constroi a classe Person com os dados adquiridos
				Person p = new Person(account_number,name, data,cpf,email,card_password,account_password);
			
				CommitTxt.write(p); // Registra o usuário em um TXT
				
				System.out.println("Usuário cadastrado!"); 
			}
			else if (option != 3) { // Se a opção não for 3 repete a interface
				System.out.println("--- Valor inválido! ---");
				System.out.println();
				menu();
				option = sc.nextInt();
			}
			
			menu();
			option = sc.nextInt();
		}
		
		System.out.println("Agradecemos sua visita! ");
		sc.close();
	}
	
	// Função de interface
	public static void menu() {
		System.out.println("------ BEM VINDO AO JHON BANK ------");
		System.out.println("-----------------Menu----------------");
		System.out.println("|        1- Entrar                  |");
		System.out.println("|        2- Cadastrar-se            |");
		System.out.println("|        3- Sair                    |");
		System.out.println("-------------------------------------");
		System.out.print("Selecione a opção: ");
	}

}
