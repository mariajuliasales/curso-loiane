package mariajulia.cursojava02.aula60;

public class Teste {

	public static void main(String[] args) {

		EscopoVariavel escopo = new EscopoVariavel();

		escopo.setValor(10);

		System.out.println(escopo.getValor());
		System.out.println(escopo.calculaValor(20));
		System.out.println(escopo.getValor());
		System.out.println(escopo.teste());
		System.out.println(escopo.getValor());
		
		System.out.println();
		
		escopo.outroTeste();
		
		escopo.maiUmOutroTeste(7);

	}

}
