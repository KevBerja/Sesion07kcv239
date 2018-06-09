package ual.hmis.sesion05.ejercicio3;

import static org.junit.Assert.*;
import org.junit.Test;

public class Ejercicio3Test {

	@Test
	public void testEntradaCero() {
		Ejercicio3 entradaCero = new Ejercicio3();
		String resultado = entradaCero.asteriscos(0);
		assertEquals(resultado,"");
	}
	@Test
	public void testEntradaCinco() {
		Ejercicio3 entradaCinco = new Ejercicio3();
		String resultado = entradaCinco.asteriscos(5);
		assertEquals(resultado, "*****");
	}
	@Test
	public void testEntradaNegativo() {
		Ejercicio3 entradaNegativo = new Ejercicio3();
		String resultado = entradaNegativo.asteriscos(-1);
		assertEquals(resultado, "Numero erroneo");
	}
}
