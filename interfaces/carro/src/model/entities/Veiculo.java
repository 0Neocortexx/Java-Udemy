package model.entities;

public interface Veiculo {
	public String placa = "";
	public Double velocidadeMaxima = 200.0;
	public void ligar();
	public void desligar();
	
	default void buzinar() {
		System.out.println("Buzinando!");
	}
	
}
