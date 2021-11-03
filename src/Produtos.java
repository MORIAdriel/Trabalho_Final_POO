package src;

/*
 * Uma classe que representa um produto de uma loja ou estoque  
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Produtos{

	String nomeProduto;
	private int quatidadeEstoque;
	private double precoCusto;
	double precoVenda;
	private String dataUltimaCompraEstoque;
	Empresa fornecedora;

	Produtos(String nomeProduto, int quatidadeEstoque, double precoCusto, double precoVenda,
			String dataUltimaCompraEstoque, Empresa fornecedora) {
		this.nomeProduto = nomeProduto;
		this.quatidadeEstoque = quatidadeEstoque;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.dataUltimaCompraEstoque = dataUltimaCompraEstoque;
	}

	public void consulta(String nome) {

	}

	public void alteracaoCadastros() {

	}
	
	public String toString() {
		
		return "Produto: Nome do produto: " + nomeProduto +
			" - Quantidade em estoque: " + quatidadeEstoque +
			" - Preço de custo: " + precoCusto +
			" - Preço de venda: " + precoVenda +
			" - Data da última ocorrência de compra: " + dataUltimaCompraEstoque +
			" - Fornecedor: "+ fornecedora.nome + "\n";
		}
}
