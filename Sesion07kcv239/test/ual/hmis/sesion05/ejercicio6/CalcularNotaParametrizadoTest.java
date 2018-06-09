package ual.hmis.sesion05.ejercicio6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio6.Actividad;
import ual.hmis.sesion05.ejercicio6.Alumno;
import ual.hmis.sesion05.ejercicio6.Ejercicio;


@RunWith(Parameterized.class)
public class CalcularNotaParametrizadoTest {
	
	private String nombreActividad;
	private int sumaNotas;
	private static double calculaNota;	
	private Alumno alumno;
	private Actividad a1, a2;
	
	//Constructor parametrizado
	public CalcularNotaParametrizadoTest(String nombreActividad, int notaSum, double nota) {
		this.nombreActividad = nombreActividad;
		this.sumaNotas= notaSum;
		calculaNota=nota;		
	}
	
	@Before
	public void setUp() throws Exception {
		alumno = new Alumno();
		alumno.setNombre("Kevin");
		
		a1 = new Actividad();
		a2 = new Actividad();
		
		a1.setNombre("Actividad 01");
		a1.setEjercicios(new ArrayList<Ejercicio>());
		a2.setNombre("Actividad 02");
		a2.setEjercicios(new ArrayList<Ejercicio>());
		
		a1.agregarEjercicioCalificado("Ejercicio 01", 7);
		a1.agregarEjercicioCalificado("Ejercicio 02", 7);
		a1.agregarEjercicioCalificado("Ejercicio 03", 4);
		
		a1.setApta(true);
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		actividades.add(a1);
		actividades.add(a2);
		alumno.setActividadesAsignadas(actividades);
	}


	@Parameters
	public static Collection<Object[]> addedNumbers() {
		return Arrays.asList(new Object[][] { 
			{"Actividad 00", 0, calculaNota}, 
			{"Actividad 01", 18, calculaNota}, 
			{"Actividad 02", 0, calculaNota},
		});
	}
	
	@Test
	public void testCalcularNota() {
		assertEquals(sumaNotas, alumno.calcularNotaActividad(nombreActividad), 0);
	}
}
