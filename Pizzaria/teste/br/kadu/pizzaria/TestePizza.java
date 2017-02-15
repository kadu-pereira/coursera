package br.kadu.pizzaria;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestePizza {
	
	@Before
	public void before(){
		Pizza.zeraIngredientes();
		System.out.println("Qntd ingredientes: "+Pizza.ingredientesUtilizados.size());
	}
	
	@After
	public void after(){
		System.out.println("Qntd ingredientes: "+Pizza.ingredientesUtilizados.size());
	}

	@Test
	public void testPreco1() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("mussarela");
		pizza.adicionaIngrediente("calabresa");
		assertEquals(15, pizza.getPreco());
		
	}
	
	@Test
	public void testPreco2() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("mussarela");
		pizza.adicionaIngrediente("tomate");
		pizza.adicionaIngrediente("presunto");
		pizza.adicionaIngrediente("azeitona");
		assertEquals(20, pizza.getPreco());
		
	}
	
	@Test
	public void testPreco3() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("mussarela");
		pizza.adicionaIngrediente("tomate");
		pizza.adicionaIngrediente("ovo");
		pizza.adicionaIngrediente("presunto");
		pizza.adicionaIngrediente("cebola"); 
		pizza.adicionaIngrediente("parmezao");
		pizza.adicionaIngrediente("azeitona");
		assertEquals(23, pizza.getPreco());
		
	}

}
