package mariajulia.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Upcasting Aluno aluno = new Aluno(); Pessoa alunoPessoa = aluno;
		 * 
		 * Pessoa aluno2 = (Pessoa) new Aluno();
		 * 
		 * Pessoa aluno3 = new Aluno(); Aluno aluno4 = (Aluno) aluno3;
		 * 
		 */
		Aluno aluno = new Aluno();
		Pessoa pessoa = new Pessoa();
		Professor professor = new Professor();

		if (aluno instanceof Aluno) {
			System.out.println("É do tipo Aluno");
		}

		if (pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}

		if (professor instanceof Professor) {
			System.out.println("É do tipo Professor");
		}

	}

}
