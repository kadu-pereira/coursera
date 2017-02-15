import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutoridade {

	Autoridade autoridade;
	
	/**
	 * Cenário de teste Informal
	 */
	@Test
	public void testInformal() {
		Informal informal = new Informal();
		autoridade = new Autoridade("Kadu", "Neves", informal);
		String tratamento = autoridade.getTratamento();
		System.out.println(tratamento);
		assertEquals("Kadu", tratamento);
		
	}
	
	/**
	 * Cenário de teste Respeitoso Masculino
	 */
	@Test
	public void testRespeitosoMasculino() {
		Respeitoso respeitoso = new Respeitoso("masculino");
		autoridade = new Autoridade("Kadu", "Neves", respeitoso);
		String tratamento = autoridade.getTratamento();
		System.out.println(tratamento);
		assertEquals("Sr. Neves", tratamento);
		
	}
	
	/**
	 * Cenário de teste Respeitoso Feminino
	 */
	@Test
	public void testRespeitosoFeminino() {
		Respeitoso respeitoso = new Respeitoso("feminino");
		autoridade = new Autoridade("Nadia", "Morettin", respeitoso);
		String tratamento = autoridade.getTratamento();
		System.out.println(tratamento);
		assertEquals("Sra. Morettin", tratamento);
		
	}
	
	/**
	 * Cenário de teste comTitulo
	 */
	@Test
	public void testComTitulo() {
		ComTitulo comTitulo = new ComTitulo("Magnifíco");
		autoridade = new Autoridade("Kadu", "Neves", comTitulo);
		String tratamento = autoridade.getTratamento();
		System.out.println(tratamento);
		assertEquals("Magnifíco Kadu Neves", tratamento);
		
	}

}
