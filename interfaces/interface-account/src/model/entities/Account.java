package model.entities;

public class Account implements ImpostoInterface{
	
	private String name;
	private Double balance;
	
	public double imposto(double taxa) {
		return balance * taxa;
	}
 	
}
