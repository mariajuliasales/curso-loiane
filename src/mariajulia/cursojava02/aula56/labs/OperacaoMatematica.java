package mariajulia.cursojava02.aula56.labs;

public enum OperacaoMatematica {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	},
	SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	},
	MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	},
	DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};

	String valor;

	private OperacaoMatematica(String c) {
		this.valor = c;
	}

	public abstract double executarOperacao(double x, double y);

	public String toString() {
		return this.valor;
	}

}
