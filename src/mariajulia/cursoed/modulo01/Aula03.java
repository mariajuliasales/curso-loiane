package mariajulia.cursoed.modulo01;

public class Aula03 {

	public static void main(String[] args) {

		Vetor novoVetor = new Vetor(2);
/*		
		try {
			novoVetor.adicionarElemento("elemento 01");
			novoVetor.adicionarElemento("elemento 02");
			novoVetor.adicionarElemento("elemento 03");
		} catch (Exception e) {
			e.printStackTrace();
		}
*/
		System.out.println(novoVetor.adicionar("elemento 01"));
		System.out.println(novoVetor.adicionar("elemento 02"));
		System.out.println(novoVetor.adicionar("elemento 03"));
		
	}

}
