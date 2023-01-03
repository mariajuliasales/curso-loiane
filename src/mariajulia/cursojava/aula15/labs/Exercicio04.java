/*
 *  Faça um Programa que verífique se uma letra digitada é vogal ou consoante.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra.");
		char letra = scan.next().charAt(0);

		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o'
				|| letra == 'O' || letra == 'u' || letra == 'U') {
			System.out.println("A letra " + letra + " é vogal");
		} else {
			System.out.println("A letra " + letra + " é consoante.");
		}

	}

}
