package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		// João — Papo-de-Pescador, homem de bem, comprou um microcomputador para
		// controlar o rendimento diário de seu trabalho.
		// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
		// regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa
		// de R$ 4,00 por quilo excedente. João
		// precisa que você faça um programa que leia a variável peso (peso de peixes) e
		// verifique se há excesso. Se houver, gravar na variável excesso e na variável
		// muita o valor da multa que João deverá pagar. Caso contrário mostrar tais
		// variáveis com o conteúdo ZERO.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o peso de peixes:");
		double pesoPeixes = scan.nextDouble();

		if (pesoPeixes > 50.00) {
			double excessoPesoPeixes = pesoPeixes - 50;
			double multa = excessoPesoPeixes * 4.00;
			System.out.printf("O peso excedente de peixes foi de %.2fKg. A multa que João deverá pagar será de R$%.2f.",
					excessoPesoPeixes, multa);
		} else {
			System.out.println("Não há peso excedente, logo não há multa.");
		}

		scan.close();

	}

}
