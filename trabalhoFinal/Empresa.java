package trabalhoFinal;

public abstract class Empresa {
	String nome;
	String telefone;
	String cnpj;
	String razaoSocial;
	Endereco endereco;

	Empresa(String nome, String telefone, String cnpj, String razaoSocial) {
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
}
