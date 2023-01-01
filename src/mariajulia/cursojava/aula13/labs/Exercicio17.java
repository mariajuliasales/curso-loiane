package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		/*
		 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho
		 * em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
		 * é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
		 * 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam
		 * R$25,00.
		 * 
		 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
		 * preços em 3 situações: comprar apenas latas de 18 litros; comprar apenas
		 * galões de 3,6 litros; misturar latas e galões, de forma que o preço seja o
		 * menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto
		 * é, considere latas cheias.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
		double areaPintar = scan.nextDouble();

		double litrosTinta = areaPintar / 6;
		double latasTinta = litrosTinta / 18;
		double galaoTinta = litrosTinta / 3.6;
		double precoTotalLatas = latasTinta * 80;
		double precoTotalGalao = latasTinta * 25;

		System.out.printf("Deverá ser comprada %.2f litros de tinta.\n", litrosTinta);

		System.out.printf("Deverá ser comprada %.2f latas de tinta.\n", latasTinta);
		System.out.printf("O preço total de latas é de R$%.2f.\n", precoTotalLatas);

		System.out.printf("Deverá ser comprada %.2f galões de tinta.\n", galaoTinta);
		System.out.printf("O preço total de galões é de R$%.2f.\n", precoTotalGalao);

		scan.close();
	}

}
