package com.cenfotec.patrones;

import java.io.*;
import java.util.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cenfotec.patrones.logica.Calculadora;

@SpringBootApplication
public class KataDosApplication {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = new PrintStream(System.out);
	static Calculadora calc = new Calculadora();	
	
	public static void main(String[] args) {
			pedirValor();
	}
	
	static void pedirValor() {
		
		int number = 0;
		out.println("Ingrese el valor para el cual desea determinar los factores primos: \n");
		try {
			number = Integer.parseInt(in.readLine());
			imprimirFactoresPrimos(number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}
	
	static void imprimirFactoresPrimos(int number) {
		
		LinkedList<Integer> factores = calc.generate(number);
		   out.print("\nResultado de "+ number + " = ");
		   for (Integer factor: factores)
		   {
			   out.print(factor);
			   
			   if (factor != factores.getLast())
				   out.print("*");
		   }
		   out.println();
	}
}
