package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão informadas? ");
		int n = sc.nextInt();		
		sc.nextLine(); // Consumir a quebra de linha pendente

		double[] heights = new double[n];
		char[] gender = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %sa pessoa: ", i+1);
			heights[i] = sc.nextDouble();
			System.out.printf("Genero da %sa pessoa: ", i + 1);
			gender[i] = sc.next().charAt(0);
			sc.nextLine(); // Consumir a quebra de linha pendente
		}
		
		int nmans = 0;
		double media_mulheres = 0.0;
		double maior_altura = heights[0];
		double menor_altura = heights[0];
		
		for(int i = 0; i < n; i++) {
			if(gender[i] == 'M') {
				nmans++;
			}
			if (heights[i] > maior_altura) {
				maior_altura = heights[i];
			}
			if (heights[i] < menor_altura) {
				menor_altura = heights[i];
			}
			if (gender[i] == 'F') {
				media_mulheres += heights[i];
			}
		}
		
		System.out.println("Menor altura: " + menor_altura);
		System.out.println("Maior altura: " + maior_altura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", (media_mulheres / (n - nmans)));
		System.out.println("Numero de homens: " + nmans);
		
		sc.close();

	}

}
