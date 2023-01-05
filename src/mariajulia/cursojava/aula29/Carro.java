package mariajulia.cursojava.aula29;

public class Carro {

	String marca, modelo;
	int numPassageiros;
	double capCombustivel, consumoCombustivel;

	Carro() {
		System.out.println("Instanciada.");
		numPassageiros = 4;
	}

	Carro(String marca) {
		marca = marca;
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

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
