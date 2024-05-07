package mariajulia.cursoed.modulo01;

import java.lang.reflect.Array;

public class Lista<T> {

	
	private T[] elementos;
	private int tamanho;

/*	
	public Lista(int capacidade, Class<T> tipoClasse) {

		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
*/
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {

		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adicionar(T elemento) {
		
		aumentarCapacidade();
		
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
			return true;
		}
		
		return false;
	}

	public boolean adicionar(int posicao, T elemento) {
		
		aumentarCapacidade();
		
		if(!(posicao>=0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
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

	public boolean remover(int posicao) {
		if(!(posicao>=0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i = posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		diminuirCapacidade();		
		return true;
		
	}
	
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

	public T buscar(int posicao) {
		if(!(posicao>=0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		return this.elementos[posicao];
	}
	
	public int buscarExistencia(T elemento) {
		for(int i = 0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	private void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	private void diminuirCapacidade() {
		this.tamanho--;
	}
	
}
