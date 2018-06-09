package ual.hmis.sesion05.ejercicio1;

import static org.junit.Assert.*;
import org.junit.Test;

public class Ejercicio1Test {
	
	@Test
	public void testTransformaEntreDos() {
		Ejercicio1 num = new Ejercicio1();
		int resultado = num.transformar(10);
		assertEquals(resultado, 1);
	}
	
	@Test
	public void testTransformaEntre3() {
		Ejercicio1 num = new Ejercicio1();
		int resultado = num.transformar(9);
		assertEquals(resultado, 1);
	}
	
	@Test
	public void testTransformaEntre5() {
		Ejercicio1 num = new Ejercicio1();
		int resultado = num.transformar(25);
		assertEquals(resultado, 1);
	}
	
	@Test
	public void testEsPrimo() {
		Ejercicio1 num = new Ejercicio1();
		int resultado = num.transformar(7);
		assertEquals(resultado, 7);
	}
	
	@Test
	public void testNoEsPrimo() {
		Ejercicio1 num = new Ejercicio1();
		int resultado = num.transformar(30);
		assertEquals(resultado, 1);
	}
	

}
