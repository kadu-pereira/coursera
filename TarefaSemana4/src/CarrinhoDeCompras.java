import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto, Integer> produtos = new HashMap<>();

	// metodo adiciona produto 
	public void adicionaProduto(Produto produto, Integer quantidade) {

		//com a sobrescrita do metodo equals a operação containsKey ja diferencia os produtos
		//de acordo com o código do produto e tamanho
		if (produtos.containsKey(produto)) {
			Integer quantidadeExistente = produtos.get(produto);
			produtos.put(produto, quantidadeExistente + quantidade);
		} else {
			produtos.put(produto, quantidade);
		}

	}

	// metodo remove produto
	public void removeProduto(Produto produto, Integer quantidade) {
		
		//com a sobrescrita do metodo equals a operação containsKey ja diferencia os produtos
				//de acordo com o código do produto e tamanho
		if (produtos.containsKey(produto)) {
			Integer quantidadeExistente = produtos.get(produto);

			if (quantidade >= quantidadeExistente) {
				produtos.remove(produto);
			} else {
				Integer novaQuantidade = quantidadeExistente - quantidade;
				produtos.put(produto, novaQuantidade);
			}

		}
	}

	// metodo calcula valor toral do carrinho
	public int calculaValorTotal() {
		int total = 0;

		for (Produto produto : produtos.keySet()) {
			total += produto.getPreco() * produtos.get(produto);
		}

		return total;
	}

}
