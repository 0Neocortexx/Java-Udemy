package util;

import java.util.Random;

public class Filters {
	
	public static String validaSenha(String senha) {
		String[] caracteresEspeciais = {"/", ".", "@", "!", "#", "$", "¨", "&", "*", "(", ")", "'", ",", "-", "_", "=", "+", "´","?", ":",";","|"};
		String ok = "sc";
		Integer valor = senha.length();
		for (String s : caracteresEspeciais) {
			if (senha.contains(s) && valor >= 8) { // Contains, verifica se algum caractere ou parte da string contem em outra
				ok = "sv";
			} else if (senha.contains(s) && valor < 8) {
				ok = "pc";
			} 
		}
		return ok;
	} 
	
	public static int geraSenha () {
		Random r = new Random();
		int password = r.nextInt(1000,9999);
		return password;
	}
	
	public static int geraConta() {
		Random r = new Random();
		int conta = r.nextInt(100000,999999);
		return conta;
	}
	
	
	public static boolean validaEmail(String email) {
		boolean ok = false;
		if (email.contains("@")) {
			
			String[] validar = email.split("@");
			email = validar[1];
			String[] filtroFicticio = {"gmail.com", "hotmail.com", "outlook.com", "yahoo.com.br"}; // Lista em java {}
		
			for(String s : filtroFicticio) {
				if (s.equals(email)) { // Equals, verifica se a string contém o exato valor da outra
					ok = true;
				}
			}
		}
		return ok;
	}
	
}
