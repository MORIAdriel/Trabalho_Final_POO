package trabalhoFinal;

import java.util.ArrayList;

public class Loja extends Empresa implements Funcoes {
	
	ArrayList<Produtos> produtos = new ArrayList<>();

	Loja(String nome, String telefone, String cnpj, String razaoSocial) {
		super(nome, telefone, cnpj, razaoSocial);	
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
