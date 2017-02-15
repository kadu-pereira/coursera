import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	//cenario de teste onde produtos com códigos iguais e tamanhos iguais são considerados
	//o mesmo produto
	@Test
	public void testProdutoIgual() {
		Produto produto1 = new ProdutoComTamanho("produto1", 123, 10, 40);
		Produto produto2 = new ProdutoComTamanho("produto1", 123, 10, 40);
		assertTrue(produto1.equals(produto2));
	}
	
	//cenario de teste onde produtos com códigos diferentes são considerados diferentes
	@Test
	public void testProdutoCodigoDiferente() {
		Produto produto1 = new ProdutoComTamanho("produto1", 123, 10, 40);
		Produto produto2 = new ProdutoComTamanho("produto1", 456, 10, 40);
		assertFalse(produto1.equals(produto2));
	}
	
	//cenario de teste onde produtos com codigos iguais mas tamanho diferente são considerados
	//produtos diferentes
	@Test
	public void testProdutoCodigoIgualTamanhoDiferente() {
		Produto produto1 = new ProdutoComTamanho("produto1", 123, 10, 40);
		Produto produto2 = new ProdutoComTamanho("produto1", 123, 10, 38);
		assertFalse(produto1.equals(produto2));
	}

}
