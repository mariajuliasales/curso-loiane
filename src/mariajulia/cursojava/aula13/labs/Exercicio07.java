package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
		// desta área para o usuário.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do lado do quadrado:");
		double ladoQuadrado = scan.nextDouble();

		double area = Math.pow(ladoQuadrado, 2);

		System.out.printf("A area do quadrado é %.2f.\n", area);
		System.out.printf("O dobro de %.2f é %.2f.", area, area * 2);

		scan.close();
	}

}
