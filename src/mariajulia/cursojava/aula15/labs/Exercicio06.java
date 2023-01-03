/*
 * Faça um Programa que leia três números e mostre o maior deles
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		double numero1 = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		double numero2 = scan.nextDouble();
		System.out.println("Digite o terceiro número:");
		double numero3 = scan.nextDouble();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O número maior é:" + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O número maior é:" + numero2);
		} else {
			System.out.println("O número maior é:" + numero3);
		}
	}

}
