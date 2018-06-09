package ual.hmis.sesion05.ejercicio5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio5ParametrizadoTest {

		private static String edad;
		private static String[] cSplit;
		private int contTest;
		Ejercicio5 e;

		public Ejercicio5ParametrizadoTest(String s) {
			edad = s;
			if (s.contains(".")) {
				cSplit = s.split("[.]");
				edad = cSplit[0];
			}
		}

		@Before
		public void setUp() throws Exception {
			e = new Ejercicio5();
		}

		@Parameters
		public static Collection<Object[]> addedNumbers() {
			return Arrays.asList(new Object[][] { { "Mayor de edad" }, { "Edad 3. años" }, { "Menor. De edad 3" } });
		}

		@Test
		public void testTransformaNumero() {
			if (contTest == 0) {
			++contTest;
			assertEquals(e.subcadenahastaPunto(edad), "Error: cadena sin punto");
			} else if (contTest == 1) {
				++contTest;
				assertEquals(e.subcadenahastaPunto(edad), "Error: cadena con digito");
			} else {
				assertEquals(e.subcadenahastaPunto(edad), "Menor.");
			}
		}
}
