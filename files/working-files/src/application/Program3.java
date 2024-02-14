package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good Afternoon", "Good Night"};

		String path = "c:\\temp\\out.db";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String e : lines) {
				bw.write(e + "\n");
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
