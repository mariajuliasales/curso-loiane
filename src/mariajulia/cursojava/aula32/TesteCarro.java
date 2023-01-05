package mariajulia.cursojava.aula32;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro("Ford", "Uno", 5, 20, 80);

		System.out.println(carro.toString());
		
		System.out.println();

		carro.setMarca("Fiat");
		carro.setModelo("maria maria");
		carro.setNumPassageiros(8);

		System.out.println(carro.toString());

	}

}
