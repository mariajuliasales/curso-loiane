package mariajulia.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCursos("Engenharia de Controle e Automação");
		double[] notas = { 10, 9, 8, 7 };
		aluno.setNotas(notas);

		System.out.println(aluno);

		String s1 = "abbbb";
		String s2 = "abbbB";

		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		
		System.out.println();
		
		Aluno aluno2 = new Aluno();

		aluno2.setCursos("Engenharia de Controle e Automação");
		double[] notas2 = { 10, 9, 8, 7 };
		aluno2.setNotas(notas);
		
		System.out.println(aluno == aluno2);
		System.out.println(aluno.equals(aluno2));

	}

}
