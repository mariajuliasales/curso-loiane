package mariajulia.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;

		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;

		// falso e verdadeiro dá falso, logo o valor dos dois resultados é false.
		// com um & o programa lê as duas variaveis, falso e verdadeiro.
		// com dois && o programa lê apenas o falso, que fara com que o valor seja false
		// independente da segunda variavel.

		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
