package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Farenheit, transforme e
		// mostre a temperatura em graus Celsius.
		// C=(5"(F-32)/9)

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Farenheit:");
		double temperaturaFarenheit = scan.nextDouble();

		double temperaturaCelsius = (temperaturaFarenheit - 32) / 9 * 5;

		System.out.printf("%.2f graus Farenheit é %.2f graus Celsius", temperaturaFarenheit, temperaturaCelsius);

		scan.close();
	}

}
