import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutoridade {

	Autoridade autoridade;
	
	/**
	 * Cen�rio de teste Informal
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
	 * Cen�rio de teste Respeitoso Masculino
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
	 * Cen�rio de teste Respeitoso Feminino
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
	 * Cen�rio de teste comTitulo
	 */
	@Test
	public void testComTitulo() {
		ComTitulo comTitulo = new ComTitulo("Magnif�co");
		autoridade = new Autoridade("Kadu", "Neves", comTitulo);
		String tratamento = autoridade.getTratamento();
		System.out.println(tratamento);
		assertEquals("Magnif�co Kadu Neves", tratamento);
		
	}

}
