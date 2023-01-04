package mariajulia.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[5];

		Random random = new Random();

		for (int i = 1; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		System.out.println();

		System.out.println("For each:");
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println();

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 9;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9;

		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 2;
		notasAlunos[1][2] = 6;
		notasAlunos[1][3] = 4;

		notasAlunos[2][0] = 7;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 5;
		notasAlunos[2][3] = 9;

		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}
	}

}
