package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		// trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quanto voce ganha por hora:");
		double salarioHora = scan.nextDouble();

		System.out.println("Digite quantas horas você trabalha por mes:");
		double horasMes = scan.nextDouble();

		double salarioMes = salarioHora * horasMes;

		System.out.printf("O seu salário é de R$%.2f.", salarioMes);

		scan.close();
	}

}
