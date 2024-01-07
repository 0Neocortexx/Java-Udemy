import java.util.Scanner;

public class baskara {

	public static void main(String[] args) {
		
		// Tipagem das variáveis
		Double delta, x1, x2, a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o A da questão: ");
		a = sc.nextDouble();
		System.out.print("Digite o B da questão: ");
		b = sc.nextDouble();
		System.out.print("Digite o C da questão: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - (4*a*c); // Calcula delta
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a); 
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("O resutado dos X é: "+ x1 + " " + x2);
		sc.close();
	}

}
