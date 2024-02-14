package application;

import model.entities.Carro;
import model.entities.Veiculo;

public class Program{
	
	public static void main(String[] args) {
		
		Carro gol = new Carro("Gol Bolinha", "EAP-2014", 200.0);

		System.out.println(gol);
		
		gol.ligar();
		gol.buzinar();
		gol.desligar();

		gol.setName("Gol");

		System.out.println(gol);

	}

}
