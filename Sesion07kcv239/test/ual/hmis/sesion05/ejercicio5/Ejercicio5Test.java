package ual.hmis.sesion05.ejercicio5;

import static org.junit.Assert.*;
import org.junit.Test;

public class Ejercicio5Test {

	@Test
	public void cadenaSinPunto() {
		Ejercicio5 cadena = new Ejercicio5();
		String s = cadena.subcadenahastaPunto("Mayor de edad");
		assertEquals(s, "Error: cadena sin punto");
	}
	
	@Test
	public void cadenaConNumero() {
		Ejercicio5 cadena = new Ejercicio5();
		String s = cadena.subcadenahastaPunto("Edad 3. años");
		assertEquals(s, "Error: cadena con digito");
	}
	
	@Test
	public void cadenaSubCadena() {
		Ejercicio5 cadena = new Ejercicio5();
		String s = cadena.subcadenahastaPunto("Menor. De edad 3");
		assertEquals(s, "Menor.");
	}
}
