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
		int i , aux = -1;
		Boolean sair = true;
		String escolha;
		// Usado para criar uma Empresa
		String nome, telefone, cnpj, razaoSocial;
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
					escolha = input.next();
					input = new Scanner(System.in);
					if (escolha.equals("1")) {

						// Criação da loja
						System.out.println("Qual o nome da loja?");
						nome = input.nextLine();
						System.out.println("Qual o número de telefone da loja?");
						telefone = input.next();
						System.out.println("Qual o CNPJ da loja?");
						cnpj = input.next();
						input = new Scanner(System.in);
						System.out.println("Qual a razão social da loja?");
						razaoSocial = input.nextLine();
						Loja loja = new Loja(nome, telefone, cnpj, razaoSocial);

						// Criação do estoque da loja
						System.out.println("Qual a capacidade máxima do estoque da loja?");
						capacidadeMax = input.nextInt();
						input = new Scanner(System.in);
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
						telefone = input.next();
						System.out.println("Qual o CNPJ do fornecedor?");
						cnpj = input.next();
						input = new Scanner(System.in);
						System.out.println("Qual a razão social do fornecedor?");
						razaoSocial = input.nextLine();
						Fornecedor fornecedor = new Fornecedor(nome, telefone, cnpj, razaoSocial);

						// Criação do estoque do fornecedor
						System.out.println("Qual a capacidade máxima do estoque do fornecedor?");
						capacidadeMax = input.nextInt();
						Estoque estoque = new Estoque(capacidadeMax);
						input = new Scanner(System.in);
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

					System.out.println("Qual o nome da empresa?");
					nome = input.nextLine();
					for (i = 0; i < empresas.size(); i++) {
						if (nome.equals(empresas.get(i).nome)) {
							aux = i;
							break;
						}
					}

					if (aux == i) {

						System.out.println("1 - Mudar dados principais\n" +
								"2 - Mudar o endereço\n" +
								"3 - Mudar dados do estoque");

						escolha = input.next();
						input = new Scanner(System.in);
						if (escolha.equals("1")) {

							System.out.println("Trocar nome: (Atual = " + empresas.get(i).nome + ")");
							nome = input.nextLine();
							System.out.println("Trocar telefone: (Atual = " + empresas.get(i).telefone + ")");
							telefone = input.next();
							System.out.println("Trocar CNPJ: (Atual = " + empresas.get(i).cnpj + ")");
							cnpj = input.next();
							input = new Scanner(System.in);
							System.out.println("Trocar a razão social: (Atual = " + empresas.get(i).razaoSocial + ")");
							razaoSocial = input.nextLine();

							empresas.get(i).alteracaoCadastros(nome, telefone, cnpj, razaoSocial);
						} else if (escolha.equals("2")) {

							System.out.println("Trocar estado: (Atual = " + empresas.get(i).endereco.estado + ")");		
							estado = input.nextLine();
							System.out.println("Trocar cidade: (Atual = " + empresas.get(i).endereco.cidade + ")");		
							cidade = input.nextLine();
							System.out.println("Trocar bairro: (Atual = " + empresas.get(i).endereco.bairro + ")");		
							bairro = input.nextLine();

							empresas.get(i).endereco.alteracaoCadastros(estado, cidade, bairro);

						} else if (escolha.equals("3")) {

							System.out.println("Trocar a capacidade máxima: (Atual = " + empresas.get(i).estoque.getCapacidadeMax() + ")");	
							capacidadeMax = input.nextInt();

							empresas.get(i).estoque.setCapacidadeMax(capacidadeMax);

							// Implementar ainda troca de dados dos produtos

						} else {
							System.out.println("Dado errado");
						}
					} else {
						System.out.println("Não existe essa empresa");
					}
					break;
				case "5":
					sair = false;
			}
		}

		// Teste de empresa
		for (i = 0; i < empresas.size(); i++) {
			System.out.println(empresas.get(i));
		}
	}
}
