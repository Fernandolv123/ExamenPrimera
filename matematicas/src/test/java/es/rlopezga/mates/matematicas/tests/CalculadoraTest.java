package es.rlopezga.mates.matematicas.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.rlopezga.mates.matematicas.Calculadora;

public class CalculadoraTest {
	
	private Calculadora c = new Calculadora();
	
	@Test
	void testSolucion1Correcta() {
		//solucion1 = 3
		Assertions.assertTrue(c.solucion1(1, -5, 6) == 3);
		//solucion1 = 3
		Assertions.assertEquals(c.solucion1(2, -7, 3), 3);
		//solucion = -5
		Assertions.assertEquals(c.solucion1(-1, -7, -10), -5);
	}
	
	@Test
	void testSolucion2Correcta() {
		//solucion 2
		Assertions.assertEquals(c.solucion2(1, -5, 6), 2);
		//solucion 0.5
		Assertions.assertEquals(c.solucion2(2, -7, 3), 0.5);
		//solucion -2
		Assertions.assertEquals(c.solucion2(-1, -7, -10),-2);
	}
	
	@Test
	void testSolucion1Incorrecta() {
		//Lanza una excepcion de tipo ArithmeticException
		Assertions.assertThrows(ArithmeticException.class, () -> {c.solucion1(1, 1, 1);});
	}
	
	@Test
	void testSolucion2Incorrecta() {
		//Lanza una excepcion de tipo ArithmeticException
		Assertions.assertThrows(ArithmeticException.class, () -> {c.solucion2(1, 1, 1);});
	}
	
	@Test
	void testPrimo() {
		Assertions.assertTrue(c.esPrimo(2));
		Assertions.assertTrue(c.esPrimo(7));
		Assertions.assertTrue(c.esPrimo(19));
	}
}
