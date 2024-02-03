package util;
import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Person;

public class CommitTxt {
	public static void write(Person p) {
		java.io.File diretorio = new java.io.File("C:\\Users\\jonat\\OneDrive\\Área de Trabalho\\java-workspace\\jhonbank\\src\\data\\users.txt");
		
		try {
			diretorio.createNewFile();
			
			FileWriter fw = new FileWriter(diretorio, true);
			
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(p); 
			
			pw.flush();
			
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
