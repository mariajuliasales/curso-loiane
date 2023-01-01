package mariajulia.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 2;

		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 e 2 - resultado: " + resultado1);

		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 e 1 OR valor2 e 2  - resultado: " + resultado2);

		boolean verdadeiro = true;
		boolean falso = false;

		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		// ^ para ser verdadeiro apenas uma das alternativas deve ser verdadeira
		System.out.println(!verdadeiro && falso);
		// estou negando o verdadeiro, logo ele passa a ser falso
	}

}
