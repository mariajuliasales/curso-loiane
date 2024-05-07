package mariajulia.cursoed.modulo01;

public class Aula09 {

	public static void main(String[] args) {

		Vetor novoVetor = new Vetor(10);
		
		novoVetor.adicionar("B"); // 0 
		novoVetor.adicionar("G"); // 1
		novoVetor.adicionar("D"); // 2 
		novoVetor.adicionar("E"); // 2 
		novoVetor.adicionar("F"); // 2 

			
		System.out.println(novoVetor.toString());
		
		novoVetor.remover(1);
		
		System.out.println(novoVetor.toString());
		
		int posicao = novoVetor.buscarExistencia("D");
		if(posicao>-1) {
			novoVetor.remover(posicao);			
		}
		
		System.out.println(novoVetor.toString());

	}

}
