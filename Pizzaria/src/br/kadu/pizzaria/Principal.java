package br.kadu.pizzaria;

import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		//cria pizza 1 e adiciona ingredientes
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("mussarela");
		pizza1.adicionaIngrediente("calabresa");
		
		//cria pizza 2 e adiciona ingredientes
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("mussarela");
		pizza2.adicionaIngrediente("tomate");
		pizza2.adicionaIngrediente("presunto");
		pizza2.adicionaIngrediente("azeitona");
		
		//cria pizza 3 e adiciona ingredientes
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("tomate");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("presunto");
		pizza3.adicionaIngrediente("cebola"); 
		pizza3.adicionaIngrediente("parmezao");
		pizza3.adicionaIngrediente("azeitona");
		
		//cria o carrinho e adiciona as pizzas
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);
		
		//imprimi o valor total do carrinho
		System.out.println("Valor total do carrinho = "+carrinho.calculaValorTotal());
		
		//imprimi a lista de ingredientes utilizados em todas as pizzas e as quantidades
		for (Map.Entry<String, Integer> map : Pizza.ingredientesUtilizados.entrySet()){
			System.out.println("Ingrediente: "+map.getKey()+"--- Quantidade: "+map.getValue());
		}

	}

}
