package mariajulia.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}

		System.out.println("\n");

		for (int i = 5; i > 0; i--) {
			System.out.println("Valor de i: " + i);
		}

		System.out.println("\n");

		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i: " + i + "; j: " + j);
		}

		int count = 0;

		for (; count < 10;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}

		int soma = 0;
		for (int i = 0; i < 10; soma += i++)
			;
		System.out.println(soma);
	}

}
