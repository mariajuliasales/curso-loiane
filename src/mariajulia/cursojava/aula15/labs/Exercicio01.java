/*
 * Faça um Programa que peça dois numeros e imprima o maior deles.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		double primeiroNumero = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		double segundoNumero = scan.nextDouble();

		if (primeiroNumero > segundoNumero) {
			System.out.println("O primeiro número inserido é maior que o segundo.");
			System.out.println(primeiroNumero + ">" + segundoNumero);
		} else {
			System.out.println("O segundo número inserido é maior que o primeiro.");
			System.out.println(primeiroNumero + "<" + segundoNumero);
		}

	}

}
