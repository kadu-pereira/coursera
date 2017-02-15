
public class Autoridade {

	private String nome;
	private String sobreNome;

	private FormatadorNome format;

	/**
	 * Construtor
	 * 
	 * @param nome
	 * @param sobreNome
	 * @param formatNome
	 */
	public Autoridade(String nome, String sobreNome, FormatadorNome formatNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.format = formatNome;
	}

	/**
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @return sobrenome
	 */
	public String getSobreNome() {
		return sobreNome;
	}

	/**
	 * Método que delega a formatação do nome para a instância de FormatadorNome
	 * 
	 * @return nome formato de acordo com a implementação de formatador
	 */
	public String getTratamento() {

		return this.format.formatarNome(this.getNome(), this.getSobreNome());
	}
}
