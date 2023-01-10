package mariajulia.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {

// Downcasting

		Object object1 = obterString();
		String string1 = (String) object1;

		Object object2 = "string string";
		String string2 = (String) object2;

		Object object3 = obterInt();
		String string3 = (String) object3;

		Object object4 = new Object();
		String string4 = (String) object4;

	}

	public static String obterString() {
		return "É uma String";
	}

	public static int obterInt() {
		return 1;
	}

}
