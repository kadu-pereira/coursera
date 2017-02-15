package br.kadu.pizzaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompras {

	// Cenario de teste que verifica o valor total do carrinho de compras
	@Test
	public void testSomaPizzas() {
		// cria pizza 1 e adiciona ingredientes
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("mussarela");
		pizza1.adicionaIngrediente("calabresa");

		// cria pizza 2 e adiciona ingredientes
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("mussarela");
		pizza2.adicionaIngrediente("tomate");
		pizza2.adicionaIngrediente("presunto");
		pizza2.adicionaIngrediente("azeitona");

		// cria pizza 3 e adiciona ingredientes
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("tomate");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("presunto");
		pizza3.adicionaIngrediente("cebola");
		pizza3.adicionaIngrediente("parmezao");
		pizza3.adicionaIngrediente("azeitona");

		// cria o carrinho e adiciona as pizzas
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);

		// 1 pizza de 15 + 1 pizza de 20 + 1 pizza de 23 = 58
		assertEquals(58, carrinho.calculaValorTotal());

	}
	
	// Cenario de teste que verifica o valor total do carrinho de compras
	// tentando adicionar uma pizza sem ingredientes
	@Test
	public void testSomaPizzas2() {
		// cria pizza 1 sem ingredientes
		Pizza pizza1 = new Pizza();

		// cria pizza 2 e adiciona ingredientes
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("mussarela");
		pizza2.adicionaIngrediente("tomate");
		pizza2.adicionaIngrediente("presunto");
		pizza2.adicionaIngrediente("azeitona");

		// cria pizza 3 e adiciona ingredientes
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("tomate");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("presunto");
		pizza3.adicionaIngrediente("cebola");
		pizza3.adicionaIngrediente("parmezao");
		pizza3.adicionaIngrediente("azeitona");

		// cria o carrinho e adiciona as pizzas
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);

		// 1 pizza de 20 + 1 pizza de 23 = 43
		assertEquals(43, carrinho.calculaValorTotal());

	}
	
	// cenario de teste que verifica se impede a adição de uma pizza 
	// sem ingredientes. O valor esperado é zero e a mensagem de erro 
	// deve ser impressa
	@Test
	public void testPizzaSemIngrediente(){
		Pizza pizza = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza);
		assertEquals(0, carrinho.getPizzas().size());
		
	}

}
