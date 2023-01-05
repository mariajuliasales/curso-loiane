package mariajulia.cursojava.aula31;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.marca = "Ford";
		carro.consumoCombustivel=10;

//		carro.dividirKmPorConsumoCombustivel(10);

		System.out.println("Combustivel: " + carro.calcularCombustivel(15));

	}

}
