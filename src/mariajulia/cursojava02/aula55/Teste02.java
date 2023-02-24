package mariajulia.cursojava02.aula55;

import mariajulia.cursojava02.aula53.DiaSemana;

public class Teste02 {

	public static void main(String[] args) {

		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		System.out.println(dia);
	}

}
