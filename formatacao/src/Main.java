import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// configurar a localidade do programa
		Locale.setDefault(Locale.US);
		
		System.out.print("Hello World!");
		System.out.println("Good Morning!");
		int a = 32;
		
		// Pra limitar o numero de casas decimais printf
		double b = 10.232323232;
		System.out.println(a);
		// Sys.out.printf("%.2(duas casas decimais)f%n(o %n é a quebra de linha)", b);
		System.out.println(b);
		// O prog tá imprimindo com vigula ao inves de ponto
		// o java pega a localização do pc e usa o padrao pra usar de outro lugar tem que importar 
		// lá em cima tem um exemplo de import do jdk
		System.out.printf("%.2f%n", b);
		
		// pra juntar coisa no print concatena com o +
		System.out.println("Valor 1 é: "+a+" \nValor 2 é: "+b);
		
		// no printf tambem
		System.out.printf("Valor 1 é: \nValor 2 é: %.2f",b);
		System.out.println("\n------ PRA ENCERRAR ------");
		String nome = "Maria";
		int idade = 19;
		double renda = 1200.2999;
		System.out.printf("Seu nome é %s Tem %d anos de idade e sua renda é %.2f", nome,idade,renda);
		
	}

}
