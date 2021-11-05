package src;

import java.util.ArrayList;

/*
 * Uma classe Estoque que contem os produtos de uma Loja 
 * @author Igor M. Padua e Adriel L. V. Mori
 */

public class Estoque {

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

	public boolean verificaEstoque(int capacidadeMax, int total) {
		
		if(capacidadeMax<total) return false;
		else return true;
	}

	public String toString() {
		return "Capacidade máxima: " + capacidadeMax;
	}
}
