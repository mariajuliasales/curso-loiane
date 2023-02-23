package mariajulia.cursojava02.aula54;

import mariajulia.cursojava02.aula54.Formulario.Genero;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.SEGUNDA;

		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);

		System.out.println();
		System.out.println(data);

		System.out.println();

		Formulario form = new Formulario("maria julia", Genero.FEMININO);
						
		System.out.println(form.getGenero().getValor());

	}

}
