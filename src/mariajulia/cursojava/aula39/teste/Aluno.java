package mariajulia.cursojava.aula39.teste;

import mariajulia.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCursos() {
		return curso;
	}

	public void setCursos(String cursos) {
		this.curso = cursos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void metodoQualquer() {
		super.setTelefoneCelular("5566556600");

		this.setTelefoneCelular("20202020");
	}

	public void verificarAcesso() {
		super.nomeVisibilidade = "maria maria";
		this.nomeVisibilidade = "maria maria";
	}
}
