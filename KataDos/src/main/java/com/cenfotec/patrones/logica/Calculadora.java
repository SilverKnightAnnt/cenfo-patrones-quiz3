package com.cenfotec.patrones.logica;

import java.util.LinkedList;

public class Calculadora {

	public LinkedList<Integer> generate(int number) {
		
		int factor = 2;
		LinkedList<Integer> factores = new LinkedList<Integer>();
		int factorLimite = (int)Math.sqrt(number);
		
		while (factor <= factorLimite)
		{			
			while (number % factor == 0 )
			{
				factores.add(new Integer(factor));
				number = number/factor;
			}		
			
			if (factor==2)
				factor++;
			else
				factor+=2;
		}
		
		if (number!=1) {
			factores.add(new Integer(number));
		} 
		if (number == 0) {
			factor = 0;
		}		
		
		return factores;
	}
}
