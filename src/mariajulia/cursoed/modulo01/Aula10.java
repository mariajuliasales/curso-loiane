package mariajulia.cursoed.modulo01;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato contato01 = new Contato("Contato 01", "0000", "12345");
		Contato contato02 = new Contato("Contato 02", "2222", "23456");
		Contato contato03 = new Contato("Contato 03", "1111", "67891");

		Contato contato04 = new Contato("Contato 02", "2222", "23456");
		
		vetor.adicionar(contato01);
		vetor.adicionar(contato02);
		vetor.adicionar(contato03);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		System.out.println(vetor);
		
		int posicao = vetor.buscarExistencia(contato04);
		
		if(posicao>-1) {
			vetor.remover(posicao);			
		}
		
		System.out.println(vetor.toString());
		

	}

}
