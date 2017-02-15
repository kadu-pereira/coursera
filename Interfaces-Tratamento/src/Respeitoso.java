
public class Respeitoso implements FormatadorNome {

	private String sexo;

	/**
	 * Construtor
	 * @param sexo
	 */
	public Respeitoso(String sexo) {
		this.sexo = sexo;

	}

	/**
	 * Implementa��o Respeitoso da interface FormatadorNome
	 */
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (this.getSexo().equals("masculino"))
			return "Sr. " + sobrenome;
		else
			return "Sra. " + sobrenome;

	}

	/**
	 * 
	 * @return sexo
	 */
	public String getSexo() {
		return sexo;
	}

}
