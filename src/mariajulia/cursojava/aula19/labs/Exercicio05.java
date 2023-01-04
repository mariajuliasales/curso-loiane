/*
 * Criar um vetor A com 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou
Índice), ou seja:Bl =Af) "i
 */

package mariajulia.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Preencha o vetor B:");

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
		}

		System.out.print("Conteudo do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("Conteudo do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
