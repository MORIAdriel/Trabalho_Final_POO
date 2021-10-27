package src;

/*
 * Uma classe abstrata que representa uma empresa
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public abstract class Empresa implements Funcoes {
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

	public void consulta(String nome) {
		
	}

	public void alteracaoCadastros() {
		
	}

	public void capacidadeEstoque() {
		
	}

	public boolean verificaEstoque() {
		return false;
	}

	public String toString() {
		return "Nome: " + nome +
			" - Telefone: " + telefone +
			" - Cnpj: " + cnpj +
			" - Razão social: " + razaoSocial +
			" - Endereco: " + endereco;
	}
}
