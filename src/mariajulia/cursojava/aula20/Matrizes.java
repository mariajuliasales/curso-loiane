package mariajulia.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {

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

		System.out.println("Tamanho da matriz: " + notasAlunos.length);
		System.out.println();

		System.out.println("notasAlunos:");
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Média de notasAlunos:");
		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + (i+1) + " = " + (soma / 4));
		}

		System.out.println();

		double[][] notasAlunos1 = { { 7, 8, 9, 10 }, { 8, 6, 7, 10 }, { 5, 9, 8, 9 } };

		System.out.println("notasAlunos1:");
		for (int i = 0; i < notasAlunos1.length; i++) {
			for (int j = 0; j < notasAlunos1[i].length; j++) {
				System.out.print(notasAlunos1[i][j] + " - ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Média de notasAlunos1:");
		double soma1;
		for (int i = 0; i < notasAlunos1.length; i++) {
			soma1 = 0;
			for (int j = 0; j < notasAlunos1[i].length; j++) {
				soma1 += notasAlunos1[i][j];
			}
			System.out.println("Média do aluno " + (i+1) + " = " + (soma1 / 4));
		}
	}

}
