package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class calculateRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle;
		rectangle = new Rectangle();
		System.out.println("Enter with height of rectangle: ");
		rectangle.height = sc.nextDouble();
		System.out.println("Enter with width of rectangle: ");
		rectangle.width = sc.nextDouble();
		System.out.println(rectangle);
		sc.close();
	}

}
