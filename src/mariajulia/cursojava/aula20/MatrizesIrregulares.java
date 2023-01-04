package mariajulia.cursojava.aula20;

import java.util.Scanner;

public class MatrizesIrregulares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número de pessoas que serão entrevistadas:");
		int numEntrevistados = scan.nextInt();

		String[][] nomesFilhos = new String[numEntrevistados][];

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos da pessoa " + (i + 1));
			int qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			scan.nextLine();

			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho " + (j + 1));
				nomesFilhos[i][j] = scan.nextLine();
			}

			System.out.println();
		}

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
			System.out.println();
		}
	}

}
