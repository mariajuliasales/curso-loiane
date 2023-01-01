package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		// Faça um Programa que peça dois números e imprima a soma.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int segundoNumero = scan.nextInt();

		System.out.printf("A soma de %d e %d é %d.", primeiroNumero, segundoNumero, primeiroNumero + segundoNumero);

		scan.close();
	}

}
