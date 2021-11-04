package src;

/*
 * Uma classe que representa um fornecedor 
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Fornecedor extends Empresa {

	Fornecedor(String nome, String telefone, String cnpj, String razaoSocial) {
		super(nome, telefone, cnpj, razaoSocial);	
	}

	public String toString() {
		return "Fornecedor: " + super.toString() + " - " + estoque;
	}

}
