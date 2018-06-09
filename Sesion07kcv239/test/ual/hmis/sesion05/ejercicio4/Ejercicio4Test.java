package ual.hmis.sesion05.ejercicio4;

import static org.junit.Assert.*;
import org.junit.Test;

public class Ejercicio4Test {

	@Test
	public void testEntradaVacio() {
		Ejercicio4 entradaVacio = new Ejercicio4();
		String resultado = entradaVacio.comprobarEntrada("", "");
		assertEquals(resultado, "");
	}

	@Test
	public void testEntradaUnCaracter() {
		Ejercicio4 entradaVacio = new Ejercicio4();
		String resultado = entradaVacio.comprobarEntrada("cef", "abcde");
		assertEquals(resultado, "f");
	}

	@Test
	public void testEntradaCincoCaracteres() {
		Ejercicio4 entradaVacio = new Ejercicio4();
		String resultado = entradaVacio.comprobarEntrada("yjklm", "abcde");
		assertEquals(resultado, "yjklm");
	}

	@Test
	public void testEntradaNull() {
		Ejercicio4 entradaVacio = new Ejercicio4();
		String resultado = entradaVacio.comprobarEntrada(null, null);
		assertEquals(resultado, "Es nulo");
	}

	@Test
	public void testEntradaNumeros() {
		Ejercicio4 entradaVacio = new Ejercicio4();
		String resultado = entradaVacio.comprobarEntrada("1234", "56");
		assertEquals(resultado, "1234");
	}
}
