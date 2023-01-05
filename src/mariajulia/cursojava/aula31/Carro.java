package mariajulia.cursojava.aula31;

public class Carro {

	String marca, modelo;
	int numPassageiros;
	double capCombustivel, consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	public double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}

	private double dividirKmPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {
		return this.dividirKmPorConsumoCombustivel(km);
	}
}
