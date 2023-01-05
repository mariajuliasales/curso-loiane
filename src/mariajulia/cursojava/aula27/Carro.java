package mariajulia.cursojava.aula27;

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

	double calcularCombustivel(double km) {
		return km / consumoCombustivel;
	}

}
