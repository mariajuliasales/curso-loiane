package mariajulia.cursoed.modulo01;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	// Construtor
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

	public int tamanho() {
		return this.tamanho;
	}
/*	
	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}
*/

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		if(tamanho>0) {
						
			for (int i = 0; i<this.tamanho-1; i++) {
				s.append(this.elementos[i]);
				s.append(", ");
			}
			
			s.append(this.elementos[this.tamanho-1]);
			s.append("]");
			
		} else {
			System.out.println("Null");	
		}
		
		return s.toString();
	}

/*
	public String imprimir() {
		
		String s = "[";
		
		if(tamanho>0) {
			
			for (int i = 0; i<this.tamanho-1; i++) {
				s += this.elementos[i];
				s += ", ";
			}
			
			s += this.elementos[this.tamanho-1];
			s += "]";

		} else {
			System.out.println("Null");	
		}
		
		return s.toString();
		
	}	
*/

}