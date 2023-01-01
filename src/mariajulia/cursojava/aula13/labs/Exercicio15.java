package mariajulia.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15.Faça um Programa que pergunte quanto você ganha por hora e o número de
		// horas trabalhadas no mês. Calcule e mostre o total do seusalário no referido
		// mês, sabendo-se que são descontados 11% para oImposto de Renda, 8% para o
		// INSS e 5% para o sindicato, faça umprograma que nos dê:
		// Salário bruto.
		// a. quanto pagou ao INSS.
		// b. quanto pagou ao sindicato.
		// c. o salário líquido.
		// d. calcule os descontos e o salário líquido, conforme a tabelaabaixo:
		// + Salário Bruto : R$ - IR (11%) : R$ - INSS
		// (8%) : R$ - Sindicato ( 5%) : R$ = Salário
		// Liquido : R$

		// Obs.: Salário Bruto - Descontos = Salário Líquido.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quanto voce ganha por hora:");
		double salarioHora = scan.nextDouble();

		System.out.println("Digite quantas horas você trabalha por mes:");
		double horasMes = scan.nextDouble();

		double salarioBruto = salarioHora * horasMes;

		double impostoDeRenda = salarioBruto * 11 / 100;
		double iNSS = salarioBruto * 8 / 100;
		double sindicato = salarioBruto * 5 / 100;
		double salarioLiquido = salarioBruto - impostoDeRenda - iNSS - sindicato;

		System.out.printf("+ Salário Bruto: R$%.2f\n", salarioBruto);
		System.out.printf("- Imposto de Renda: R$%.2f\n", impostoDeRenda);
		System.out.printf("- INSS: R$%.2f\n", iNSS);
		System.out.printf("- Sindicato: R$%.2f\n", sindicato);
		System.out.printf("= Salário Liquido: R$%.2f\n", salarioLiquido);

		scan.close();
	}

}
