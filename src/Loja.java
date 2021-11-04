package src;

import java.util.ArrayList;

/*
 * Uma classe que representa uma loja  
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Loja extends Empresa {

	Loja(String nome, String telefone, String cnpj, String razaoSocial) {
		super(nome, telefone, cnpj, razaoSocial);	
	}

	public void alteracaoCadastros() {

	}

	public String toString() {
		return "Loja: " + super.toString() + " - " + estoque;
	}
}
