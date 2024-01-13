package entities;

public class Person {
	
	private final int taxa = 5;
	
	private String name;
	private int account_number;
	private double value;
	
	public Person() {
	}
	
	public Person(String name, int account_number) {
		this.name = name;
		this.account_number = account_number;
	}
 
	public Person(String name, int account_number, double initialDeposit) {
		this.name = name;
		this.account_number = account_number;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAccount_number() {
		return account_number;
	}

	public double getValue() {
		return value;
	}

	public void deposit(double value) {
		this.value += value;
	}
	
	public void saque(double value) {
		this.value = (this.value - taxa) - value;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Account number: " + account_number + ", Value: " + value;
	}
	
	
}
