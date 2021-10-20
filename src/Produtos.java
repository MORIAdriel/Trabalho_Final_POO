package src;

/*
 * Uma classe que representa um produto de uma loja ou estoque  
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Produtos {

	String nome;
	private int quatidadeEstoque;
	private double precoCusto;
	double precoVenda;
	private String dataUltimaCompraEstoque;
	Fornecedor fornecedor;

	Produtos(String nome, int quatidadeEstoque) {
		this.nome = nome;
		this.quatidadeEstoque = quatidadeEstoque;
	}

	public void exclusao(Produtos produtos) {

	}

	public void consulta(String nome) {

	}

	public void alteracaoCadastros() {

	}

}
