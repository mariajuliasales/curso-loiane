package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
		 * velocidade de um link de Internet (em Mbps), calcule e informe o tempo
		 * aproximado de download do arquivo usando este link (em minutos).
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho do arquivo:");
		double tamArquivo = scan.nextDouble();
		System.out.println("Digite a velocidade da internet:");
		double velocidadeInternete = scan.nextDouble();

		double tempo = tamArquivo / velocidadeInternete;

		System.out.println("Tmepo de download: " + tempo);
	}

}
