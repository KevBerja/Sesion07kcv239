package ual.hmis.sesion05.ejercicio1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio1ParametrizadoTest {
	private static int transformado;
	Ejercicio1 e;

	public Ejercicio1ParametrizadoTest(int num) {
		transformado = num;
	}

	@Before
	public void setUp() throws Exception {
		e = new Ejercicio1();
	}
	
	@Parameters
	public static Collection<Object[]> addedNumbers() {
		return Arrays.asList(new Object[][] { { 10 }, { 9 }, { 25 }, { 7 }, { 30 } });
	}

	@Test
	public void testTransformaNumero() {
		if (e.transformar(transformado)==1) {
			assertEquals(e.transformar(transformado), 1);
		} else {
			assertEquals(e.transformar(transformado), transformado); //Numero primo
		}
	}
}
