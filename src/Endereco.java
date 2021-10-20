package src;

/*
 * Uma classe que contem os dados de um endereço
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class Endereco {
	String bairro;
	String cidade;
	String estado;

	Endereco(String bairro, String cidade, String estado) {
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
}
