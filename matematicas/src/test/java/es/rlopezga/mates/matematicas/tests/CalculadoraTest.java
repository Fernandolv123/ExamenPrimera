package es.rlopezga.mates.matematicas.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.rlopezga.mates.matematicas.Calculadora;

public class CalculadoraTest {
	
	private Calculadora c = new Calculadora();
	
	@Test
	void testSolucion1() {
		//solucion1 = 3
		Assertions.assertTrue(c.solucion1(1, -5, 6) == 3);
		//solucion1 = 3
		Assertions.assertEquals(c.solucion1(2, -7, 3), 3);
		//solucion = -5
		Assertions.assertEquals(c.solucion1(-1, -7, -10), -5);
	}
}
