package mariajulia.cursojava.aula25;

public class Carro {

	String marca, modelo;
	int numPassageiros;
	double capCombustivel, consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}

}
