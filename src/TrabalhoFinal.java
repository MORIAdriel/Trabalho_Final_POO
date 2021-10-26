package src;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Classe principal do programa  
 * @author Igor M. Padua e Adreil M. V. Mori
 */

public class TrabalhoFinal {
	public static void main(String[] args) {
		Boolean sair = true;
		String escolha;

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
	}
}
