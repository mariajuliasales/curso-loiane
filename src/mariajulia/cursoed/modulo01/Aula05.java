package mariajulia.cursoed.modulo01;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor novoVetor = new Vetor(5);
		
		novoVetor.adicionar("elemento 1");
		novoVetor.adicionar("elemento 2");
		novoVetor.adicionar("elemento 3");
		novoVetor.adicionar("elemento 4");
		novoVetor.adicionar("elemento 5");
				
		System.out.println(novoVetor.buscar(0));
		System.out.println(novoVetor.buscar(1));
		System.out.println(novoVetor.buscar(2));
		System.out.println(novoVetor.buscar(3));
		System.out.println(novoVetor.buscar(4));
		System.out.println(novoVetor.buscar(5));

	}

}
