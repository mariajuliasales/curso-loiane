package mariajulia.cursoed.modulo01;

public class Aula07 {

	public static void main(String[] args) {

		Vetor novoVetor = new Vetor(6);
		
		novoVetor.adicionar("B"); // 0 
		novoVetor.adicionar("C"); // 1
		novoVetor.adicionar("D"); // 2 
		
		System.out.println(novoVetor.adicionar(0, "A"));
		
		System.out.println(novoVetor.toString());
	}

}
