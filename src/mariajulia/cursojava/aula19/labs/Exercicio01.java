/*
 * Criar um vetor AÀ com 5 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A,
 *  ouseja, B[i] = A[i].
 */

package mariajulia.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Preencha o vetor B:");

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
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
