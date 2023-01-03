/*
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número:");
		double numero = scan.nextDouble();

		if (numero >= 0) {
			System.out.println("O número " + numero + " é positivo.");
		} else {
			System.out.println("O número " + numero + " é negativo.");
		}

	}

}
