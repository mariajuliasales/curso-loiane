package mariajulia.cursoed.modulo01;

public class Aula04 {

	public static void main(String[] args) {
		
		Vetor novoVetor = new Vetor(5);

		novoVetor.adicionar("elemento 01");
		novoVetor.adicionar("elemento 02");
		novoVetor.adicionar("elemento 03");
		novoVetor.adicionar("elemento 04");
		
		System.out.println(novoVetor.tamanho());
		
		System.out.println(novoVetor.toString());
		
	}

}
