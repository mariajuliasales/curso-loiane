package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		// Tendo como dados de entrada a altura e o sexo de uma pessoa,construa um
		// algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
		// Para homens: (72.7*h) - 58
		// Para mulheres: (62.1ºh) - 44.7 (h = altura)
		// Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Digite F para sexo feminimo e M para sexo masculino:");
		char sexo = scan.next().charAt(0);

		double pesoIdeal;

		if (sexo == 'F') {
			pesoIdeal = 62.1 * altura - 44.7;
		} else {
			pesoIdeal = 72.7 * altura - 58;
		}

		System.out.printf("Seu peso ideal é: %fKg", pesoIdeal);

		System.out.println("Digite o seu peso para saber se está dentro, acima ou abaixo do peso:");
		double peso = scan.nextDouble();

		if (peso < pesoIdeal) {
			System.out.println("Voce está abaixo do peso ideal.");
		} else if (peso == pesoIdeal) {
			System.out.println("Voce está dentro do peso ideal.");
		} else {
			System.out.println("Voce está acima do peso ideal.");
		}

		scan.close();
	}

}
