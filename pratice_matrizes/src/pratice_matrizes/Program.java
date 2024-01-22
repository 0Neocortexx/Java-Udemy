package pratice_matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// Instanciando a matriz na memória
		// Os elementos dela, por padrão se inicial com 0
		int[][] mat = new int[n][n]; // Os dois colchetes indicam que o arranjo é Bidimensional (Tridimensional int [][][])
		
		for (int i = 0; i < mat.length; i++) { // Percorre as linhas
			for (int j = 0; j < mat[i].length; j++) { // Percorre as colunas
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal");
		for (int i = 0; i < mat.length ; i++) {  // Na diagonal, tanto a linha quanto a coluna possuem o mesmo valor
			System.out.print(mat[i][i]+ " ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Numeros negativos: " + count);
		
		sc.close();
	}

}
