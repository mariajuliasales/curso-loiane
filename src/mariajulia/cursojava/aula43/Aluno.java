package mariajulia.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
//		super(nome, endereco, telefone);
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
//		super.setTelefoneCelular("5566556600");

//		this.setTelefoneCelular("20202020");
	}

	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: ";
//		s += super.getEndereco();

		return s;
	}

//	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Endereço do aluno: ");
		System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;

		if (curso.equalsIgnoreCase(other.getCursos())) {
			return true;
		}

		return false;
//		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}

//	public String toString() {
//		String s = this.curso + "\n";
//		for (double nota : this.notas) {
//			s += nota + " ";
//		}
//		return s;
//	}

}
