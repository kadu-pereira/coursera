package br.kadu.pizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {

	private List<String> ingredientes = new ArrayList<String>();

	static Map<String, Integer> ingredientesUtilizados = new HashMap<String, Integer>();

	// adiciona ingredientes
	public void adicionaIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}

	// calcula preço da pizza
	public int getPreco() {
		int preco = 0;
		int qtdIngredientes = ingredientes.size();

		if (qtdIngredientes <= 2)
			preco = 15;
		if (qtdIngredientes >= 3 && qtdIngredientes <= 5)
			preco = 20;
		if (qtdIngredientes > 5)
			preco = 23;

		return preco;
	}

	// retorna a lista de ingredientes da pizza
	public List<String> getIngredientes() {
		return ingredientes;
	}

	// metodo estatico para contabilizar os ingredientes de todas as pizzas
	public static void contabilizaIngrediente(String ingrediente) {

		int somaIngrediente = 0;

		boolean ingredienteJaAdicionado = ingredientesUtilizados.containsKey(ingrediente);

		if (ingredienteJaAdicionado) {
			somaIngrediente = ingredientesUtilizados.get(ingrediente) + 1;
			ingredientesUtilizados.put(ingrediente, somaIngrediente);
		} else {
			ingredientesUtilizados.put(ingrediente, 1);
		}

	}

	// metodo estatico para zerar lista de ingredientes
	public static void zeraIngredientes() {
		ingredientesUtilizados.clear();
	}

}
