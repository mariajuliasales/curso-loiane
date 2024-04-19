package mariajulia.cursoed.livro.capitulo01;

import java.util.Scanner;

public class TesteBuscaBinaria {

	public static void main(String[] args) {

		int[] lista1a50 = new int[50];
		
		int numero = 13;
		
		int baixo = 0;
		int alto = lista1a50.length - 1;
		int meio;
		
		int tentativa;
		
		boolean acerto = false;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i < lista1a50.length; i++) {
			
			lista1a50[i]=i;
			
		}
		
		do {
			
			System.out.println("Chute um numero de " + baixo + " a " + (alto+1));
			tentativa = scan.nextInt();
			
			meio = (baixo + alto)/2;
			
			if(tentativa == numero) {
				
				System.out.println("Parabens! O número é " + tentativa);
				acerto = true;
				
			} else if(tentativa > numero) {
				
				alto = meio - 1;
				
			} else {
				
				baixo = meio + 1;
				
			}
			
		} while (!acerto);
		
		System.out.println("saiu");

	}

}
