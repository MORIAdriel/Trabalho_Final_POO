package src;

/*
 * Uma classe que representa um fornecedor 
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Fornecedor extends Empresa {

	Estoque estoque;
	
	Fornecedor(String nome, String telefone, String cnpj, String razaoSocial) {
		super(nome, telefone, cnpj, razaoSocial);	
	}

	public void exclusao(Fornecedor fornecedor) {

	}

	public void consulta(String nome) {

	}

	public void alteracaoCadastros() {

	}

	public String toString() {
		return super.toString() + " - " + estoque;
	}

}
