/*
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
 * que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato 
 * e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado 
 * (é a empresa que deposita). 
 * O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
 * O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 * Desconto do IR:
 * Salário Bruto até 900 (inclusive) - isento
 * SalárioBruto até 1500 (inclusive) - desconto de 5%
 * Salário Bruto até 2500 (inclusive) - desconto de 10%
 * Salário Bruto acima de 2500 - desconto de 20% 
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
 * No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 * Salário Bruto: (5 * 220) + R$ 1100,00
 * () 1R (59) s R$  55,00
 * (-) TNSS (/ 108) s R$ 110,00
 * FoTs (119) R$ 121,00
 * Total de descontos * R$ 165,00
 * Salário Liquido « R$ 935,00
 */

package mariajulia.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int impostoDeRenda = 0, sindicato = 3, fgts = 11;
		double salarioLiquido = 0, descontoIR = 0, descontoSindicato = 0, descontoFGTS = 0;

		System.out.println("Digite quanto voce ganha por hora:");
		double salarioHora = scan.nextDouble();

		System.out.println("Digite quantas horas você trabalha por mes:");
		double horasMes = scan.nextDouble();

		double salarioBruto = salarioHora * horasMes;

		if (salarioBruto <= 900.00) {
			impostoDeRenda = 0;
			descontoIR = salarioBruto * impostoDeRenda / 100;
			descontoSindicato = salarioBruto * descontoSindicato / 100;
			descontoFGTS = salarioBruto * fgts / 100;
			salarioLiquido = salarioBruto - descontoIR - descontoSindicato;
		} else if (salarioBruto <= 1500.00) {
			impostoDeRenda = 5;
			descontoIR = salarioBruto * impostoDeRenda / 100;
			descontoSindicato = salarioBruto * descontoSindicato / 100;
			descontoFGTS = salarioBruto * fgts / 100;
			salarioLiquido = salarioBruto - descontoIR - descontoSindicato;
		} else if (salarioBruto <= 2500.00) {
			impostoDeRenda = 10;
			descontoIR = salarioBruto * impostoDeRenda / 100;
			descontoSindicato = salarioBruto * descontoSindicato / 100;
			descontoFGTS = salarioBruto * fgts / 100;
			salarioLiquido = salarioBruto - descontoIR - descontoSindicato;
		} else {
			impostoDeRenda = 20;
			descontoIR = salarioBruto * impostoDeRenda / 100;
			descontoSindicato = salarioBruto * descontoSindicato / 100;
			descontoFGTS = salarioBruto * fgts / 100;
			salarioLiquido = salarioBruto - descontoIR - descontoSindicato;
		}

		System.out.printf("+ Salário Bruto (%.2f * %.2f): R$%.2f\n", salarioHora, horasMes, salarioBruto);
		System.out.printf("- Imposto de Renda (%d): R$%.2f\n", impostoDeRenda, descontoIR);
		System.out.printf("- INSS: R$%.2f\n", descontoSindicato);
		System.out.printf("- FGTS: R$%.2f\n", descontoFGTS);
		System.out.printf("- Total de descontos: R$%.2f\n", salarioBruto - salarioLiquido);
		System.out.printf("= Salário Liquido: R$%.2f\n", salarioLiquido);

	}

}
