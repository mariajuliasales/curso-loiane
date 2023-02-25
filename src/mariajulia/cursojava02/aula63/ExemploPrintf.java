package mariajulia.cursojava02.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

//		System.out.printf("%-20s%n", "ola, mundo");
//		System.out.printf("%20S%n", "ola, mundo");
//		System.out.printf("%c%n", 'c');
//		System.out.printf("%C%n", 'c');
//		
//		System.out.println();
		
		int valor = 102030405;
		int valor2 = -444444;
		
		System.out.printf("%d", valor);
		System.out.println();
		System.out.printf("%d", valor2);
		System.out.println();
		System.out.printf("%+d", valor);
		System.out.println();
		System.out.printf("%,d", valor);
		System.out.println();
		System.out.printf("% d", valor);
		System.out.println();
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("%015d", valor);
		System.out.println();
		
		testeMaisCompleto();

	}
	
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}

}
}
