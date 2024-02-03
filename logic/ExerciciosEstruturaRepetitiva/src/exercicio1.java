import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	
		for (int i = 0; i <= x; i++) {
			int y = i % 2;
			if (y != 0) {
				System.out.println("Valores impares = " + i);
			}
		}
		
		sc.close();
	}

}
