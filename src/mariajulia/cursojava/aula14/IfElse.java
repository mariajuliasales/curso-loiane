package mariajulia.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("Digite sua idade:"); int idade = scan.nextInt();
		 * 
		 * if (idade >= 18) { System.out.println("Você é maior de idade."); } else {
		 * System.out.println("Você não é maior de idade."); }
		 */

		/*
		 * barato <= 10 10< valor <15 * pedir desconto 15 <= valor <17 - pesquisar mais
		 * >=17 - caro
		 */
		System.out.println("Digite o preço do item:");
		int valor = scan.nextInt();

		if (valor <= 10) {
			System.out.println("Está barato.");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais.");
		} else {
			System.out.println("Está caro.");

		}

	}
}
