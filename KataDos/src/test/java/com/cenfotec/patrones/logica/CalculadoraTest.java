package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void pruebaIntVacio() {
		Calculadora calc = new Calculadora();
		assertEquals(0, calc.generate(0));
	}
}
