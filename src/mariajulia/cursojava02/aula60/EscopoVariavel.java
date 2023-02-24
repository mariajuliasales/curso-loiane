package mariajulia.cursojava02.aula60;

public class EscopoVariavel {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor) {
		valor = valor + 10;
		return valor;
	}

	public int teste() {
		int valor = 5;

		if (true) {
			valor--;
		}

//		this.valor = valor;

		return valor;
	}

	public void outroTeste() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println();

//		for (int i = 0; i < 10; i++)
//			System.out.println(i);
//		System.out.println();

		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}

		System.out.println();

		System.out.println(j);
	}

	public void maiUmOutroTeste(int num) {

		int total = 0;

		try {
			int outroNum = 0;

			total = num / outroNum;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			total++;
			// outroNum++; //erro de compilação
			// e.printStackTrace(); //erro de compilação
		}

		num++;

		// outroNum++; //erro de compilação
		// e.printStackTrace(); //erro de compilação
	}

}
