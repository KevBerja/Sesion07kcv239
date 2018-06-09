package ual.hmis.sesion05.ejercicio3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio3ParametrizadoTest {
	private static int num;
	Ejercicio3 e;

	public Ejercicio3ParametrizadoTest(int numero) {
		num = numero;
	}

	@Before
	public void setUp() throws Exception {
		e = new Ejercicio3();
	}

	@Parameters
	public static Collection<Object[]> addedNumbers() {
		return Arrays.asList(new Object[][] { { 0 }, { 5 }, { -1 } });
	}

	@Test
	public void testTransformaNumero() {
		if (num == 0) {
			assertEquals(e.asteriscos(num), "");
		} else if (num < 0) {
			assertEquals(e.asteriscos(num), "Numero erroneo");
		} else {
			assertEquals(e.asteriscos(num), "*****");
		}
	}
}
