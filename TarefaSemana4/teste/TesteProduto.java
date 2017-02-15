import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProduto {

	//cenario de teste onde produtos com códigos iguais são considerados o mesmo produto
	@Test
	public void testProdutoIgual() {
		Produto produto1 = new Produto("produto1", 123, 10);
		Produto produto2 = new Produto("produto2", 123, 20);
		assertTrue(produto1.equals(produto2));
	}
	
	//cenario de teste onde produtos com códigos diferentes são considerados produtos
	//diferentes
	@Test
	public void testProdutoDiferente() {
		Produto produto1 = new Produto("produto1", 123, 10);
		Produto produto2 = new Produto("produto1", 456, 10);
		assertFalse(produto1.equals(produto2));
	}

}
