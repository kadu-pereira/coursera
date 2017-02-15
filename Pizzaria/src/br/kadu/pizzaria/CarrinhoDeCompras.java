package br.kadu.pizzaria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Pizza> pizzas = new ArrayList<Pizza>();

	// adiciona pizza no carrinho
	public void adicionaPizza(Pizza pizza) {
		if (pizza.getIngredientes().isEmpty()) {
			System.out.println("Não é permitido adicionar pizza sem ingredientes");
		} else {
			pizzas.add(pizza);
		}

	}

	// calcula valor toral do carrinho
	public int calculaValorTotal() {
		int total = 0;

		for (Pizza pizza : pizzas) {
			total += pizza.getPreco();
		}

		return total;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

}
