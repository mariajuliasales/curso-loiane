package mariajulia.cursoed.modulo01;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor novoVetor = new Vetor(3);
		
		novoVetor.adicionar("elemento 1"); // 0 
		novoVetor.adicionar("elemento 2"); // 1
		novoVetor.adicionar("elemento 3"); // 2 
		
		System.out.println(novoVetor.buscarExistencia("elemento 1"));
		System.out.println(novoVetor.buscarExistencia("elemento 2"));
		System.out.println(novoVetor.buscarExistencia("elemento 3"));
		System.out.println(novoVetor.buscarExistencia("elemento 4"));
		
	}

}
