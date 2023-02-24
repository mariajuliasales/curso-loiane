package mariajulia.cursojava02.aula56;

public class Teste {

	public static void main(String[] args) {

//		for (TipoDocumento doc : TipoDocumento.values()) {
//			System.out.println(doc + " - " + doc.geraNumeroTeste());
//		}

		Pessoa pessoa = new Pessoa(TipoDocumento.CPF, TipoDocumento.CPF.geraNumeroTeste());

		Pessoa pessoa2 = new Pessoa(Enum.valueOf(TipoDocumento.class, "CNPJ"), TipoDocumento.CNPJ.geraNumeroTeste());

		Pessoa pessoa3 = new Pessoa();

		pessoa3.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pessoa3.setNumeroDocumento(pessoa3.getTipoDocumento().geraNumeroTeste());

		System.out.println(pessoa);
		System.out.println(pessoa2);
		System.out.println(pessoa3);

	}

}
