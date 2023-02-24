package mariajulia.cursojava02.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;

		// sem o import static
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));

		// utilzando import static
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));

	}

}
