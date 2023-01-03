/*
 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. 
 * À atribuição de conceitos obedece à tabela abaixo:
 * Nédia de Aproveitamento Conceito
 * Entre 9.0 6 10.0 a
 * Entre 7.5 e 9.0 "
 * Entre 6.0 6 75 e
 * Entre 4.0 e 6.0 N
 * Entre 4.0 e zero z
 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente 
 * e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite as 2 notas bimestrais para calcular a média:");

		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		System.out.println("A média do bimestre: " + media);

		System.out.println("Notas: ");
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);

		if (media >= 9) {
			System.out.println("Conceito: A");
			System.out.println("Aprovado.");
		} else if (media >= 7.5) {
			System.out.println("Conceito: B");
			System.out.println("Aprovado.");
		} else if (media >= 6) {
			System.out.println("Conceito: C");
			System.out.println("Aprovado.");
		} else if (media >= 4) {
			System.out.println("Conceito: D");
			System.out.println("Reprovado.");
		} else {
			System.out.println("Conceito: E");
			System.out.println("Reprovado.");
		}

	}

}
