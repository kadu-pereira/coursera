
public class ComTitulo implements FormatadorNome {

	private String titulo;

	/**
	 * Construtor
	 * @param titulo
	 */
	public ComTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Implementação ComTitulo da interface FormatadorNome
	 */
	@Override
	public String formatarNome(String nome, String sobrenome) {
		
		return this.getTitulo() + " " + nome + " " + sobrenome;
	}

	/**
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	

}
