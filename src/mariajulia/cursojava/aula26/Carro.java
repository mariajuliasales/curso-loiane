package mariajulia.cursojava.aula26;

public class Carro {

	String marca, modelo;
	int numPassageiros;
	double capCombustivel, consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}

}
