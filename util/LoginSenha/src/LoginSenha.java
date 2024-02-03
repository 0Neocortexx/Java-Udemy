import java.util.*;

public class LoginSenha {

	public static void main(String[] args) { // Entry Point 
		
		// Introdução 
		System.out.println("Bem vindo ao sistema testes de Conhecimento!");
		System.out.println("Para começarmos, primeiramente iremos precisar que voce faça um registro em nossos sistemas!");
		
		// Parte Username
		System.out.print("Digite um nome de usuário: ");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		// System.out.println(username);
		Integer caracteres = username.length(); // .length() - Contagem de caracteres
		// System.out.println(caracteres);
		
		// Filtro para usernames abaixo ou acima do adequado
		while (caracteres > 16 || caracteres <= 0 || caracteres < 6) { 
			System.out.println("Número de caracteres inválido! Permitido no máximo 16 caracteres e no mínimo 6");
			System.out.print("Digite um nome de usuário: ");
			username = sc.next();
			caracteres = username.length();
		}
		
		// Parte email
		System.out.println("Nome de usuário disponível! Agora insira um email abaixo.");
		System.out.print("Digite um email: ");
		String email = sc.next().toLowerCase();
		String[] validar = email.split("@");
		// String posemail = validar[1];
		// System.out.println(posemail);
		boolean teste = validaEmail(validar[1]);
		// System.out.println(teste);
		
		// Filtro de Email Válido
		while (teste != true) {
			System.out.println("Email inválido! Digite um email válido!");
			System.out.print("Digite um email válido: ");
			email = sc.next().toLowerCase();
			validar = email.split("@");
			teste = validaEmail(validar[1]);
		}
		
		// Parte senha
		System.out.print("Digite uma senha: ");
		String password = sc.next();
		String validador = validaSenha(password);
		
		// Filtro de Senha 
		while (validador != "sv") {
			
			if (validador == "pc") {
				
				System.out.println("Por favor, digite uma senha que possua mais que 6 caracteres.");
				System.out.print("Digite uma senha: ");
				password = sc.next();
				validador = validaSenha(password);

				
			} else if (validador == "sc") {
				System.out.println("Por favor, digite uma senha que possua caracteres especiais.");
				System.out.print("Digite uma senha: ");
				password = sc.next();
				validador = validaSenha(password);
			}
		}	
		
		System.out.println("Cadastro Concluido!");
		System.out.println("Dados: Username - " + username + " - Email - "+ email + " - Senha - "+ password);
	}
	public static boolean validaEmail(String email) {
		boolean ok = false;
		String[] filtroFicticio = {"gmail.com", "hotmail.com", "outlook.com"};
		// Lista em java {}
		for(String s : filtroFicticio) {
			if (s.equals(email)) { // Equals, verifica se a string contém o exato valor da outra
				ok = true;
			}
		}
		return ok;
	}
	
	public static String validaSenha(String senha) {
		String[] caracteresEspeciais = {"/", ".", "@", "!", "#", "$", "¨", "&", "*", "(", ")", "'", ",", "-", "_", "=", "+", "´","?", ":",";","|"};
		String ok = "sc";
		Integer valor = senha.length();
		for (String s : caracteresEspeciais) {
			if (senha.contains(s) && valor >= 6) { // Contains, verifica se algum caractere ou parte da string contem em outra
				ok = "sv";
			} else if (senha.contains(s) && valor < 6) {
				ok = "pc";
			} 
		}
		return ok;
	} 
}
