package mariajulia.cursoed.modulo01;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
/*	
	public void adicionarElemento(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
		
	}
*/	
/*
	public void adicionarElemento(String elemento) throws Exception {
		
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;			
		} else {
			throw new Exception("Vetor está cheio, não é possível adicionar elemento.");
		}

	}
*/	
	public boolean adicionar(String elemento) {
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
			return true;
		}
		
		return false;

	}
}
