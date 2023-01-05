package mariajulia.cursojava.aula30;

public class Carro {

	String marca, modelo;
	int numPassageiros;
	double capCombustivel, consumoCombustivel;

	public Carro() {
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Construtor com 2 parametros");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 parametros");
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		System.out.println("Construtor com 5 parametros");
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

}
