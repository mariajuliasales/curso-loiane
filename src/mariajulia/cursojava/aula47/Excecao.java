package mariajulia.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception.");

			vetor[4] = 2;

			System.out.println("Depois da exception.");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exception tratada.");
		}

		System.out.println("Fim.");

	}

}
