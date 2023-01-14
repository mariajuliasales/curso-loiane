package mariajulia.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um numero decimal: ");
		try {
			double num = lerNum();
			System.out.println("Você digitou: " + num);

		} catch (Exception e) {
			System.out.println("Entrada invalida.");
			e.printStackTrace();
		}

	}

	public static double lerNum() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
