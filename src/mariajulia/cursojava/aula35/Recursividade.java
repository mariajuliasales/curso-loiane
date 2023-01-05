package mariajulia.cursojava.aula35;

public class Recursividade {

	public static int fatorial(int num) {

		if (num == 0) {
			return 1;
		}

		return num * fatorial(num - 1);
	}

	public static int fatorial2(int num) {
		if (num == 1) {
			return 1;
		}
		return num + fatorial2(num - 1);
	}

}
