package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Coments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Coments c1 = new Coments("Have a nice trip!");
		Coments c2 = new Coments("Wow thats awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand!", "Iam going to visit this wonderful country!", 12);
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
		
	}

}
