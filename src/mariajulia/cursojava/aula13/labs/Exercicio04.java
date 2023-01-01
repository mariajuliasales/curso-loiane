package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		// Faça um Programa que peça as 4 notas bimestrais e mostre a média

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite as 4 notas bimestrais para calcular a média:");

		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média do bimestre: " + media);

		scan.close();
	}

}
