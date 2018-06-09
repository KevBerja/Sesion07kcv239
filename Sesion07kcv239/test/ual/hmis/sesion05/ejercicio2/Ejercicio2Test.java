package ual.hmis.sesion05.ejercicio2;

import static org.junit.Assert.*;
import org.junit.Test;


public class Ejercicio2Test {
	
	@Test
	public void testComprobarVacioParametro1() {
		Ejercicio2 VacioParametro1 = new Ejercicio2();
		boolean resultado = VacioParametro1.login("","aa");
		assertEquals(resultado,false);
		
	}
	
	@Test
	public void testComprobarVacioParametro2() {
		Ejercicio2 VacioParametro1 = new Ejercicio2();
		boolean resultado = VacioParametro1.login("aa","");
		
		assertEquals(resultado,false);
	}
	
	@Test
	public void testComprobar30Parametro1() {
		Ejercicio2 VacioParametro1 = new Ejercicio2();
		boolean resultado = VacioParametro1.login("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","b");
		
		assertEquals(resultado,false);
	}
	@Test
	public void testComprobar30Parametro2() {
		Ejercicio2 VacioParametro1 = new Ejercicio2();
		boolean resultado = VacioParametro1.login("b","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		assertEquals(resultado,false);
	}
	@Test
	public void testComprobarDistintoVacioMenor30() {
		Ejercicio2 VacioParametro1 = new Ejercicio2();
		boolean resultado = VacioParametro1.login("user","pass");
		
		assertEquals(resultado,true);
	}

}
