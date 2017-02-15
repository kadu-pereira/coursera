import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompras {


	// neste teste os produtos tem codigos iguais, logo são o mesmo produto
	@Test
	public void testValorTotalProdutosIguais() {
		Produto produto1 = new Produto("produto1", 123, 10);
		Produto produto2 = new Produto("produto2", 123, 20);
		Produto produto3 = new ProdutoComTamanho("produto3", 123, 10, 40);
		Produto produto4 = new ProdutoComTamanho("produto4", 123, 10, 40);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(produto1, 10);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 10);
		carrinho.adicionaProduto(produto4, 10);

		assertEquals(400, carrinho.calculaValorTotal());
	}

	// neste teste os produtos tem codigos diferentes, logo são produtos
	// diferentes
	@Test
	public void testValorTotalProdutosCodigoIgual() {
		Produto produto1 = new Produto("produto1", 123, 10);
		Produto produto2 = new Produto("produto2", 456, 20);
		Produto produto3 = new ProdutoComTamanho("produto3", 789, 10, 40);
		Produto produto4 = new ProdutoComTamanho("produto4", 1011, 10, 40);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(produto1, 10);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 10);
		carrinho.adicionaProduto(produto4, 10);

		assertEquals(500, carrinho.calculaValorTotal());
	}
	
	//cenário de teste para opração remove quantidade x de produto existente
	@Test
	public void testRemoveProdutos() {
		Produto produto1 = new Produto("produto1", 123, 10);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(produto1, 20);
		carrinho.removeProduto(produto1, 10);

		assertEquals(100, carrinho.calculaValorTotal());
	} 

}
