package trabalhoFinal;

public class Empresa implements Funcoes{
	String nome;
	String telefone;
	String cnpj;
	String razaoSocial;
	Endereco endereco;

	Empresa(String nome, String telefone, String cnpj, String razaoSocial) {
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
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
