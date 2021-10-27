package src;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 * Classe principal do programa  
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class TrabalhoFinal {
	public static void main(String[] args) {
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		Scanner input = new Scanner(System.in);
		Boolean sair = true;
		String escolha;
		// Usado para criar uma Empresa
		String nome, telefone, cnpj, razaoSocial, capacidade;
		String bairro, cidade, estado;
		int capacidadeMax;

		while (sair == true) {
			escolha = JOptionPane.showInputDialog(null, 
					"1 - Adicionar uma empresa\n" + 
					"2 - Adicionar um produto\n" +
					"3 - Procurar um produto por endereço\n" +
					"4 - Modificar algum dado\n" +
					"5 - sair", 
					"TrabalhoFinal", JOptionPane.QUESTION_MESSAGE);
			switch (escolha) {
				case "1":
					/*
					 * Aqui o usuário poderá criar uma loja ou um fornecedor
					 */
					System.out.println("1 - Adicionar uma loja\n" +
							   "2 - Adicionar um Fornecedor");
					escolha = input.nextLine();
					if (escolha.equals("1")) {

						// Criação da loja
						System.out.println("Qual o nome da loja?");
						nome = input.nextLine();
						System.out.println("Qual o número de telefone da loja?");
						telefone = input.nextLine();
						System.out.println("Qual o cnpj da loja?");
						cnpj = input.nextLine();
						System.out.println("Qual a razão social da loja?");
						razaoSocial = input.nextLine();
						Loja loja = new Loja(nome, telefone, cnpj, razaoSocial);

						// Criação do estoque da loja
						System.out.println("Qual a capacidade máxima do estoque da loja?");
						capacidade = input.nextLine();
						capacidadeMax = Integer.parseInt(capacidade);
						Estoque estoque = new Estoque(capacidadeMax);
						loja.estoque = estoque;

						// Endereço da loja
						System.out.println("Qual o estado da loja?");		
						estado = input.nextLine();
						System.out.println("Qual a cidade da loja?");		
						cidade = input.nextLine();
						System.out.println("Qual o bairro da loja?");		
						bairro = input.nextLine();
						Endereco endereco = new Endereco(bairro, cidade, estado);
						loja.endereco = endereco;

						empresas.add(loja);

					} else if (escolha.equals("2")) { 

						// Criação do fornecedor
						System.out.println("Qual o nome do fornecedor?");
						nome = input.nextLine();
						System.out.println("Qual o número de telefone do fornecedor?");
						telefone = input.nextLine();
						System.out.println("Qual o cnpj do fornecedor?");
						cnpj = input.nextLine();
						System.out.println("Qual a razão social do fornecedor?");
						razaoSocial = input.nextLine();
						Fornecedor fornecedor = new Fornecedor(nome, telefone, cnpj, razaoSocial);

						// Criação do estoque do fornecedor
						System.out.println("Qual a capacidade máxima do estoque do fornecedor?");
						capacidade = input.nextLine();
						capacidadeMax = Integer.parseInt(capacidade);
						Estoque estoque = new Estoque(capacidadeMax);
						fornecedor.estoque = estoque;

						// Endereço da loja
						System.out.println("Qual o estado da loja?");		
						cidade = input.nextLine();
						System.out.println("Qual a cidade da loja?");		
						estado = input.nextLine();
						System.out.println("Qual o bairro da loja?");		
						bairro = input.nextLine();
						Endereco endereco = new Endereco(bairro, cidade, estado);
						fornecedor.endereco = endereco;

						empresas.add(fornecedor);

					} else {
						System.out.println("Comando errado");
					} 	

					break;
				case "2":
					/*
					 * Aqui o usuário poderá adicionar um produto a alguma loja ou fornecedor
					 */
					break;
				case "3":
					/*
					 * Aqui o usuário poderá pesquisar um endereço para encontrar lojas 
					 */
					break;
				case "4":
					/*
					 * Aqui o usuário poderá modoficiar todos os dados do programa
					 */
					break;
				case "5":
					sair = false;
			}
		}

		// Teste de empresa
		for (int i = 0; i < empresas.size(); i++) {
			System.out.println(empresas.get(i));
		}
	}
}
