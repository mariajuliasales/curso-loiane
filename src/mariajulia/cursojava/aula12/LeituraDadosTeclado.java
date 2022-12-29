package mariajulia.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next();

		System.out.println("Digite seu nome completo:");
		scan.nextLine();
		String nomeCompleto = scan.nextLine();

		System.out.println("Digite sua idade, quantidade de filhos, altura e se tem animais:");
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temAnimal = scan.nextBoolean();

		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("Seu nome completo é: " + nomeCompleto);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Quantos filhos vocÊ tem: " + qtdFilhos);
		System.out.println("Sua altura é: " + altura);
		System.out.println("Você tem filhos: " + temAnimal);
	}

}
