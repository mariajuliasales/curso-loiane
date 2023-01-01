package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		// 11.Faça um Programa que peça 2 números inteiros e um número real. Calcule e
		// mostre:
		// a. o produto do dobro do primeiro com metade do segundo .
		// b. a soma do triplo do primeiro com o terceiro.
		// c. o terceiro elevado ao cubo.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois números inteiros e um número real:");
		int primeiroNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();
		double terceiroNumero = scan.nextDouble();

		// a. o produto do dobro do primeiro com metade do segundo .
		double letraA = (primeiroNumero * 2) * (segundoNumero / 2);

		// b. a soma do triplo do primeiro com o terceiro.
		double letraB = (primeiroNumero * 3) + terceiroNumero;

		// c. o terceiro elevado ao cubo.
		double letraC = Math.pow(terceiroNumero, 3);

		System.out.printf("O produto do dobro do primeiro com metade do segundo: %.2f\n", letraA);
		System.out.printf("A soma do triplo do primeiro com o terceiro: %.2f\n", letraB);
		System.out.printf("O terceiro elevado ao cubo: %.2f\n", letraC);

		scan.close();
	}

}
