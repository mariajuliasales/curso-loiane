/*
 * Faça um Programa que pergunte em que turno você estuda.
 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
 * Imprima a mensagem "Bom Dial!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra.");
		System.out.println("M - matutino.");
		System.out.println("V - vespertino.");
		System.out.println("N - noturno.");
		char letra = scan.next().charAt(0);

		if (letra == 'm' || letra == 'M') {
			System.out.println("Bom dia!");
		} else if (letra == 'v' || letra == 'V') {
			System.out.println("Boa tarde!");
		} else if (letra == 'n' || letra == 'N') {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor inválido.");
		}

	}

}
