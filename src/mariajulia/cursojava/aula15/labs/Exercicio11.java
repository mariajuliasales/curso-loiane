/*
 * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
 * Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
 * salários de R$280,00 (incluindo) : aumento de 20%;
 * salários entre R$280,00 e R$700,00 : aumento de 15%;
 * salários entre R$700,00 e R$1500,00 : aumento de 10%;
 * salários de R$1500,00 em diante: aumento de 5%.
 * Após o aumento ser realizado informe na tela:
 * o salário antes do reajuste;
 * o percentual de aumento aplicado;
 * o valor do aumento;
 * o novo salário, apos o aumento.
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o salário:");
		double salario = scan.nextDouble();

		double novoSalario = 0, valorAumento = 0;
		int percentual = 0;

		if (salario <= 280.00) {
			percentual = 20;
			valorAumento = salario * percentual / 100;
			novoSalario = salario + valorAumento;
		} else if (salario > 280.00 && salario <= 700.00) {
			percentual = 15;
			valorAumento = salario * percentual / 100;
			novoSalario = salario + valorAumento;
		} else if (salario > 700.00 && salario <= 1500.00) {
			percentual = 10;
			valorAumento = salario * percentual / 100;
			novoSalario = salario + valorAumento;
		} else {
			percentual = 5;
			valorAumento = salario * percentual / 100;
			novoSalario = salario + valorAumento;
		}

		System.out.println("Salário antigo: R$" + salario);
		System.out.println("Percentual aplicado: " + percentual + "%");
		System.out.println("Valor do aumento: R$" + valorAumento);
		System.out.println("Novo salário: R$" + novoSalario);

	}

}
