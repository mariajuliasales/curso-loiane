package mariajulia.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		// Concatenar
		String primeiraFrase = "Essa é";
		String segundaFrase = " uma String concatenada";
		String terceiraFrase = primeiraFrase + segundaFrase;
		System.out.println(primeiraFrase + segundaFrase);
		System.out.println(terceiraFrase);

		// ate aqui o valor de resultado é 3

		System.out.println(resultado++);
		// resultado++ : primeiro mostra o valor de resultado e depois soma 1 ao valor
		System.out.println(resultado);
		// 4
		System.out.println(++resultado);
		// ++resultado : soma 1 ao valor e depois print o resultado na tela
	
		// ate aqui valor de resultado é 5
		System.out.println(resultado++);
		System.out.println(resultado);
		System.out.println(++resultado);
	}

}
