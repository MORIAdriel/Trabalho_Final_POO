package src;

/*
 * Essa classe testa se o método verifica estoque funciona
 * @author Igor M. Padua e Adriel L. V. Mori
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class ClasseTeste {
	
	@Test
	public void test1() {
		Estoque estoque = new Estoque(200);
		assertEquals(true, estoque.verificaEstoque(20));
	}
	
	@Test
	public void test2() {
		Estoque estoque = new Estoque(35);
		assertEquals(false, estoque.verificaEstoque(290));
	}
}
