package src;

import java.util.ArrayList;

/*
 * Uma classe Estoque que contem os produtos de uma Loja ou fornecedor 
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Estoque implements Funcoes {

	private int capacidadeMax;
	ArrayList<Produtos> produtosEmEstoque = new ArrayList<>();
	
	Estoque(int capacidadeMax) {
		setCapacidadeMax(capacidadeMax);
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	
	public void listagemProdutoNoEstoque(Endereco procurado) {

	}

	public void alteracaoCadastros() {
		
	}

	public void capacidadeEstoque() {
		
	}

	public boolean verificaEstoque() {
		return false;
	}

	public String toString() {
		return "Capacidade máxima: " + capacidadeMax;
	}
}
