import java.util.Random;
import java.util.random.*;
public class dados {

	public static void main(String[] args) {
		Random random = new Random();
		
		int numero_dado = random.nextInt(1,7);
		int numero_dado2 = random.nextInt(1,7);
		System.out.println("Seus valores nos dados foram: " + numero_dado + " e " + numero_dado2);

	}

}
