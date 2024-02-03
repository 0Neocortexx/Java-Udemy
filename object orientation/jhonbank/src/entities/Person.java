package entities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Person {
	public static final int agency = 0001-1;
	
	private int account_number;
	private String name;
	private String date_birth;
	private String cpf;
	private String email;
	private int card_password;
	@SuppressWarnings("unused")
	private String account_password;
	
	public Person(int account_number, String name, String date_birth, String cpf, String email, int card_password, String account_password) {
		this.account_number = account_number;
		this.name = name;
		this.date_birth = date_birth;
		this.cpf = cpf;
		this.email = email;
		this.card_password = card_password;
		this.account_password = account_password;
	}

	public int getAccount_number() {
		return account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_birth() {
		return date_birth;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAgency() {
		return agency;
	}

	public int getCard_password() {
		return card_password;
	}

	public void setCard_password(int card_password) {
		this.card_password = card_password;
	}

	public void setAccount_password(String account_password) {
		this.account_password = account_password;
	}
	
	public String criptPass(String password) {
		
		try {
			
			MessageDigest md = MessageDigest.getInstance("SHA-256"); // Instancia a classe Message Digest
			byte[] hash = md.digest(password.getBytes()); // Cria um vetor do tipo byte chamado hash 
			StringBuilder hexString = new StringBuilder(); // Instacia a classe stringBuilder
			
			/*
			 * A classe stringBuilder constroi a representação hexadecimal de um valor de 
			 * hash. Percorre os bytes do hash, converte cada byte para uma representação
			 * hexadecimal de dois digitos e os anexa ao StringBuilder.
			 * */
			
			for (byte b : hash) { // Percorre o vetor hash 
				
				hexString.append(String.format("%02x", b));
			}
			
			return hexString.toString();
			
		} catch(NoSuchAlgorithmException e){
			/*
			 * O printStackTrace é um método da class Throwable, é usado para imprimir a trila de pilha
			 * (stack trace) de uma exceção no console. Fornece informações sobre onde a excessão ocorreu no código.
			 * Inclui a sequencia de métodos que foram chamados até o ponto onde a exceção foi lançada.
			 * Útil durante o desenvolvimento para identificar a causa de um problema.
			 * */
			e.printStackTrace();
			
		}
		
		return password;
	}

	@Override
	public String toString() {
		return account_number + " " + name + " " + date_birth + " " + cpf + " " + email + " " + card_password + " " + criptPass(account_password);
	}	
	
	
}
