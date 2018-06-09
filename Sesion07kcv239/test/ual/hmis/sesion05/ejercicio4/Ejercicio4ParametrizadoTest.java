package ual.hmis.sesion05.ejercicio4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio4ParametrizadoTest {

	private static String p1, p2;
	private static int contTest;
	Ejercicio4 e;

	public Ejercicio4ParametrizadoTest(String a, String b) {
		p1 = a;
		p2 = b;
	}

	@Before
	public void setUp() throws Exception {
		e = new Ejercicio4();
	}

	@Parameters
	public static Collection<Object[]> addedNumbers() {
		return Arrays.asList(new Object[][] { { "", "" }, { "cef", "abcde" }, { "yjklm", "abcde" }, { null, null },
				{ "1234", "56" } });
	}

	@Test
	public void testTransformaNumero() {
		if (p1 == "" && p2 == "") {
			assertEquals(e.comprobarEntrada(p1, p2), "");
		} else if (p1 == null || p2 == null){
			assertEquals(e.comprobarEntrada(p1, p2), "Es nulo");
		} else if (contTest == 0) {
			++contTest;
			assertEquals(e.comprobarEntrada(p1, p2), "f");
		} else {
			assertEquals(e.comprobarEntrada(p1, p2), p1);
			
		}
	}
}
