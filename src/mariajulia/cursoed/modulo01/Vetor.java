package mariajulia.cursoed.modulo01;

public class Vetor {
	
	private String[] elementos;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
	}
	
	public void adicionarElemento(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
		
	}

}
