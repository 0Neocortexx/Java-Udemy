package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shape: ");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape "+ i + "# data: ");
			System.out.print("Rectangle or circle (r/c): ");
			char o = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			sc.nextLine();
			
			if (o == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(Color.valueOf(color), width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println("SHAPE AREAS: ");
		
		for (Shape p : list) {
			System.out.println(String.format("%.2f", p.area()));
		}
		 
		sc.close();

	}

}
