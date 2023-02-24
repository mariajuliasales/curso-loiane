package mariajulia.cursojava02.aula56.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros para realizar as operações matematicas");
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		for (OperacaoMatematica operacao : OperacaoMatematica.values()) {
			double resultado = operacao.executarOperacao(x, y);
			System.out.println(x + operacao.toString() + y + " = " + resultado);
		}

		scan.close();
	}
}
