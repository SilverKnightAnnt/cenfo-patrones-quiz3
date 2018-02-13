package com.cenfotec.patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cenfotec.patrones.logica.Calculadora;

@SpringBootApplication
public class KataDosApplication {

	static Calculadora calc = new Calculadora();
	public static void main(String[] args) {
		
		 int factor = calc.generate(4);
		   System.out.print(4+"=");
		   System.out.print(factor);
	}
}
