package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		// Faça um Programa que converta metros para centímetros.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor em metros:");
		double metros = scan.nextDouble();

		double centimetros = metros * 100;

		System.out.printf("%.2f metros é %.2f centimetros.", metros, centimetros);

		scan.close();
	}

}
