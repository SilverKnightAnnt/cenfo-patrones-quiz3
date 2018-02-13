package com.cenfotec.patrones;

import java.util.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cenfotec.patrones.logica.Calculadora;

@SpringBootApplication
public class KataDosApplication {

	static Calculadora calc = new Calculadora();
	public static void main(String[] args) {
		
		LinkedList<Integer> factores = calc.generate(4);
		   System.out.print(4+"=");
		   for (Integer factor: factores)
		   {
			   System.out.print(factor);
			   
			   if (factor != factores.getLast())
				   System.out.print("*");
		   }
		   System.out.println();
	}
}
