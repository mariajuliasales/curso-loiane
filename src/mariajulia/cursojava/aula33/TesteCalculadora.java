package mariajulia.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		int[] vetor = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i + 1;
		}

		System.out.print(calc.soma(vetor));

	}

}
