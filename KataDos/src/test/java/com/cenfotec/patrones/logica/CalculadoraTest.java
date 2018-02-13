package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void pruebaIntVacio() {
		Calculadora calc = new Calculadora();
		assertEquals(0, calc.generate(0));
	}
	
	@Test 
	public void pruebaInt() {
		Calculadora calc = new Calculadora();
		assertEquals(2, calc.generate(2));
	}
}
