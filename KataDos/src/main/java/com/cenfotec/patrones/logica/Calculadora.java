package com.cenfotec.patrones.logica;

public class Calculadora {

	public int generate(int number) {
		
		int factor = 2;
		
		int factorLimite = (int)Math.sqrt(number);
		
		while (factor <= factorLimite)
		{			
			while (number % factor == 0 )
			{				
				number = number/factor;
			}		
			
			if (factor==2)
				factor++;
			else
				factor+=2;
		}	
		if (number == 0) {
			factor = 0;
		}
		
		return factor;
	}
}
