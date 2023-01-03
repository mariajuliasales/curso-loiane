/*
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra.");
		char letra = scan.next().charAt(0);

		if (letra == 'f' || letra == 'F') {
			System.out.println("F - Feminimo");

		} else if (letra == 'm' || letra == 'M') {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inválido.");
		}

	}

}
