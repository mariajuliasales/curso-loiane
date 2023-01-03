/*
 * Faça um Programa que peça os 3 lados de um triângulo. 
 * O programa deverá informar se os valores podem ser um triângulo. 
 * Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
 * Dicas.
 * Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
 * Triângulo Equilátero: três lados iguais;
 * Triângulo Isósceles: quaisquer dois lados iguais;
 * Triângulo Escaleno: três lados diferentes;
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite os valores de 3 lados do triangulo:");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();

		boolean triangulo = false;

		if (lado1 + lado2 > lado3) {
			System.out.println("É um triangulo");
			triangulo = true;
		} else if (lado1 + lado3 > lado2) {
			System.out.println("É um triangulo");
			triangulo = true;
		} else if (lado2 + lado3 > lado1) {
			System.out.println("É um triangulo");
			triangulo = true;
		} else {
			System.out.println("Não é um triangulo");
			triangulo = false;
		}

		if (triangulo == true) {
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triangulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isósceles");
			} else {
				System.out.println("Triangulo Escaleno");
			}
		}

	}

}
