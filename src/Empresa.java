package src;

/*
 * Uma classe abstrata que representa uma empresa
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public abstract class Empresa {
	String nome;
	String telefone;
	String cnpj;
	String razaoSocial;
	Endereco endereco;
	Estoque estoque;

	Empresa(String nome, String telefone, String cnpj, String razaoSocial) {
		alteracaoCadastros(nome, telefone, cnpj, razaoSocial);
	}

	public void alteracaoCadastros(String nome, String telefone, String cnpj, String razaoSocial) {
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String toString() {
		return "Nome: " + nome +
			" - Telefone: " + telefone +
			" - Cnpj: " + cnpj +
			" - Razão social: " + razaoSocial +
			" - Endereco: " + endereco;
	}
}
