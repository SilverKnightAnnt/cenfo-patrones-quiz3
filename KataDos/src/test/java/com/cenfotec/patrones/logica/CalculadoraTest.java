package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void pruebaIntVacio() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		Calculadora calc = new Calculadora();
		assertEquals(list, calc.generate(0));
	}
	
	@Test 
	public void pruebaInt() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		Calculadora calc = new Calculadora();
		assertEquals(list, calc.generate(2));
	}
	
	@Test 
	public void pruebaIntVariosFactoresPrimos() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(2);		
		Calculadora calc = new Calculadora();
		assertEquals(list, calc.generate(4));
	}
}
