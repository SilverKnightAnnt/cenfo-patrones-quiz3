package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class CalculadoraTest {
	
	static Calculadora calc = new Calculadora();

	@Test
	public void pruebaIntVacio() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);		
		assertEquals(list, calc.generate(0));
	}
	
	@Test 
	public void pruebaInt() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);		
		assertEquals(list, calc.generate(2));
	}
	
	@Test 
	public void pruebaIntVariosFactoresPrimos() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(2);		
		assertEquals(list, calc.generate(4));
	}
	
	@Test
	public void pruebaListVariosFactoresPrimos() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		assertEquals(list, calc.generate(4620));
	}
}
