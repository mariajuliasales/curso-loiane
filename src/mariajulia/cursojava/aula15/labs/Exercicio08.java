/*
 *  Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro preço:");
		double valor1 = scan.nextDouble();
		System.out.println("Digite o segundo preço:");
		double valor2 = scan.nextDouble();
		System.out.println("Digite o terceiro preço:");
		double valor3 = scan.nextDouble();

		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("Você deve comprar o produto de valor R$" + valor1);
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println("Você deve comprar o produto de valor R$" + valor2);
		} else {
			System.out.println("Você deve comprar o produto de valor R$" + valor3);
		}

	}
}
