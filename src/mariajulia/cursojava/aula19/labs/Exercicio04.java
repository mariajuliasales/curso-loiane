/*
 * Criar um vetor A com 15 elementos inteiros. 
 * Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, 
 * ou seja: B[i] = sart(A[i]).
 */

package mariajulia.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Preencha o vetor B:");

		int[] vetorA = new int[15];
		int[] vetorB = new int[15];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = (int) Math.sqrt(vetorA[i]);
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
