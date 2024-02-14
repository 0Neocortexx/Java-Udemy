package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Items;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Caminho que do arquivo: ");
		String path = sc.next();
		sc.nextLine();
		
		System.out.print("Digite o nome do produto: ");
		String name = sc.nextLine();
		
		System.out.print("Digite o preço do produto: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();
		
		Items item = new Items(name,price,quantity);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\base.csv", true))) {
			
			bw.write(item.toString());
			bw.newLine();
			new File(path + "\\out").mkdir();
			
			try(BufferedWriter bwr = new BufferedWriter(new FileWriter(path + "\\\\out\\\\summary.csv", true))) {
				bwr.write(item.getName() + ", " + item.total() + "\n");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		} catch (IOException e){
			e.printStackTrace();
		}
		
				
		sc.close();
	}

}
