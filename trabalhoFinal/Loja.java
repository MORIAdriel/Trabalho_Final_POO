package trabalhoFinal;

import java.util.ArrayList;

class Loja extends Funcoes {
	String endereco;
	String bairro;
	String cidade;
	String estado;
	ArrayList<Produtos> produtos = new ArrayList<>();

	Loja(String nome, String endereco, String bairro, String cidade, String estado) {
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public void exclusao(Loja loja) {

	}

	public void consulta(String nome) {

	}

	public void alteracaoCadastros() {

	}

	public void procuraProduto(String cidade, String bairro, String produto) {

	}
}
