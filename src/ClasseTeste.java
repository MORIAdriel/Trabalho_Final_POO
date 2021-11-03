package src;

/*
 * Essa classe testa se o construtor de Loja funciona corretamente
 * @author Igor M. Padua e Adreil M. V. Mori
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class ClasseTeste {
	
	@Test
	public void test1() {
		Loja loja = new Loja("Marcos", "62982078786", "435/3340-01", "Produtos básicos");
		// Verifica se o CNPJ está correto
		assertTrue(loja.cnpj.equals("435/3340-01"));
	}
	
	@Test
	public void test2() {
		Loja loja = new Loja("Coca", "62987032755", "754/2018-19", "Refrigerante");
		// Verifica se a razão social está correta
		assertTrue(loja.razaoSocial.equals("Refrigerante"));
	}
}
