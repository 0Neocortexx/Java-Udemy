package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		
		System.out.print("Retirada: ");
		LocalDateTime retirada = LocalDateTime.parse(sc.next(), fmt);
		
		System.out.print("Devolução: ");
		LocalDateTime devolucao = LocalDateTime.parse(sc.next(), fmt);
		
		
		CarRental cr = new CarRental(retirada, devolucao, new Vehicle(model));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rs.processInvoice(cr);
		
		sc.close();
	}

}
