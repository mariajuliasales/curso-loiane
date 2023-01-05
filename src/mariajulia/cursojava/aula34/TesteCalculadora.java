package mariajulia.cursojava.aula34;

public class TesteCalculadora {

	public static void main(String[] args) {

//		Calculadora calc = new Calculadora();
//
//		int[] vetor = new int[5];
//
//		for (int i = 0; i < vetor.length; i++) {
//			vetor[i] = i + 1;
//		}
//
//		System.out.print(calc.soma(vetor));
		
		resultadoSoma = Calculadora.soma(1, 2);
		
		System.out.println(resultadoSoma);
		
		System.out.println(somaValores2(3, 4));

	}
	
	static int resultadoSoma;
	
	static int somaValores2(int num1, int num2) {
		return num1+num2;
	}

}
