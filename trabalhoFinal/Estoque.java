package trabalhoFinal;

import java.util.ArrayList;

public class Estoque implements Funcoes{

	private int capacidadeMax;
	ArrayList<Produtos> produtosEmEstoque = new ArrayList<>();
	
	Estoque(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	
	public void listagemProdutoNoEstoque(Endereco procurado) {

	}

	@Override
	public void consulta(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alteracaoCadastros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void capacidadeEstoque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verificaEstoque() {
		// TODO Auto-generated method stub
		return false;
	}
}
