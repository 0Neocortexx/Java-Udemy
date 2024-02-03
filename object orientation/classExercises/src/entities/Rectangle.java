package entities;

import java.util.*;

public class Rectangle {
	public double width; 
	public double height; 

	public double area() {
		return  width * height;
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt(height * height + width * width);
	}
	public String toString() {
		return "Área: " + String.format("%.2f", area()) + ", Perimeter: " + String.format("%.2f", perimeter()) + ", Diagonal: " + String.format("%.2f", diagonal());
	}
}
 