package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		// Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
		// metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
		// de 1 litro para cada 3 metros quadrados e que atinta é vendida em latas de 18
		// litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de
		// tinta a serem compradas e o preço total.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
		double areaPintar = scan.nextDouble();
		
		double litrosTinta = areaPintar / 3;
		double latasTinta = litrosTinta / 18;
		double precoTotal = latasTinta * 80;
		
		System.out.printf("Deverá ser comprada %.2f latas de tinta.\n", latasTinta);
		System.out.printf("O preço total é de R$%.2f.\n", precoTotal);
		
		scan.close();
	}

}
