package entities;

public class Person {
	private String name;
	private String cpf;
	private String date;

	public Person() {
	}
	
	public Person(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
		date = null; // Não é necessário informar o valor de date, pois por padrão é 0 ou null
	}
	
	public Person (String name, String cpf, String date) {
		this.name = name;
		this.cpf = cpf;
		this.date = date; 
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String toString() {
		return "Name: " + name + ", CPF: " + cpf + ", Data de nascimento: " + date;
	}
}

