package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Reservation rv = new Reservation(1, sdf.parse("12/03/2012"), sdf.parse("10/03/2012"));
		System.out.println(rv);
		
		rv.updateDates(sdf.parse("12/03/2012"), sdf.parse("12/03/2012"));
		System.out.println(rv);
		
		}
		catch (ParseException e){
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro Inesperado: " + e);
		}
		
		sc.close();
	}

}
