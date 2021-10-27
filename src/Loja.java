package src;

import java.util.ArrayList;

/*
 * Uma classe que representa uma loja  
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Loja extends Empresa {

	Estoque estoque;

	Loja(String nome, String telefone, String cnpj, String razaoSocial) {
		super(nome, telefone, cnpj, razaoSocial);	
	}

	public void exclusao(Loja loja) {

	}

	public void consulta(String nome) {

	}

	public void alteracaoCadastros() {

	}

	public String toString() {
		return super.toString() + " - " + estoque;
	}
}
