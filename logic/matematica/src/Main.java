
public class Main {

	public static void main(String[] args) {
		double B,b,h,area;
		// Sempre informar o numero double com o ponto. Exemplo 8.0 ou 8.5
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (((B+b)/2.0)*h);
		System.out.printf("O valor do exercicio 1 é: %.2f", area);
		
		int x, y;
		double resultado;
		x = 5;
		y = 2;
		// Casting (conversão implicita dos valores)
		resultado = (double)x / y;
		System.out.printf("\nO valor do exercicio 2 é: %.2f", resultado);
		
		double m;
		int n;
		
		m = 5.0;
		n = (int) m;
		
		System.out.printf("\nO valor do exercicio 3 é: %d", n);
		

	}

}
