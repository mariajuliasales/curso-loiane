package mariajulia.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] temperaturas = new double[365];

		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[5] = 33.1;

		System.out.println("Tamanho do array: " + temperaturas.length);
		System.out.println("Endereço de memória: " + temperaturas);

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
		}

		// for melhorado
		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
