package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Celsius,transforme e mostre
		// em graus Farenheit

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Celsius:");
		double temperaturaCelsius = scan.nextDouble();

		double temperaturaFarenheit = (temperaturaCelsius * 9 / 5) + 32;

		System.out.printf("%.2f graus Celsius é %.2f graus Farenheit", temperaturaCelsius, temperaturaFarenheit);

		scan.close();
	}

}
