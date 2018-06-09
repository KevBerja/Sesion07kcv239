package ual.hmis.sesion05.ejercicio2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio2ParametrizadoTest {
		private static String username, pass;
		Ejercicio2 e;

		public Ejercicio2ParametrizadoTest(String u, String p) {
			username = u;
			pass = p;
		}

		@Before
		public void setUp() throws Exception {
			e = new Ejercicio2();
		}
		
		@Parameters
		public static Collection<Object[]> addedNumbers() {
			return Arrays.asList(new Object[][] { { "", "aa" }, 
				{"aa", ""}, 
				{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "b"}, 
				{"b", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, 
				{"user", "pass"} });
		}

		@Test
		public void testTransformaNumero() {
			if (username.equals("user") && pass.equals("pass")) {
				assertEquals(e.login(username, pass), true);
			} else {
			assertEquals(e.login(username, pass), false);
			}
		}
}
