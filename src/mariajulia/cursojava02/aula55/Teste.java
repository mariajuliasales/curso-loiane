package mariajulia.cursojava02.aula55;

import mariajulia.cursojava02.aula54.DiaSemana;

public class Teste {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();

		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}

		for (DiaSemana diaSemana : DiaSemana.values()) {
			System.out.println(diaSemana);
		}

	}

}
