import java.util.Scanner; // Importando Scanner

public class calculadora {

	public static void main(String[] args) {
		
		// Definindo variáveis
		Double valor1, valor2, resultado;
		char sinal;
		
		// Criando scanner do terminal
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor 1: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o sinal da operação: ");
		sinal = sc.next().charAt(0);
				
		System.out.println("Valor 2: ");
		valor2 = sc.nextDouble();
		
		 if (sinal == '+') {
			resultado = valor1 + valor2;
			System.out.println("Resultado: " + resultado);
		} else if (sinal == '-') {
			resultado = valor1 - valor2;
			System.out.println("Resultado: " + resultado);
		} else if (sinal == '/') {
			resultado = valor1 / valor2;
			System.out.println("Resultado: " + resultado);
		} else if (sinal == '*') {
			resultado =  valor1 * valor2;
			System.out.println("Resultado: " + resultado);
		} else {
			System.out.println("O sinal da operação não foi reconhecido!");
		}
		
	}

}
