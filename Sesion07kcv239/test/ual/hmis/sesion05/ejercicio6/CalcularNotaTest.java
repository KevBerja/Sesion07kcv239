package ual.hmis.sesion05.ejercicio6;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ual.hmis.sesion05.ejercicio6.Actividad;
import ual.hmis.sesion05.ejercicio6.Alumno;
import ual.hmis.sesion05.ejercicio6.Ejercicio;
import ual.hmis.sesion05.ejercicio6.Profesor;

public class CalcularNotaTest {

	Profesor profesor;
	Alumno alumno;
	Actividad a1, a2, a3;
	
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

	@Test
	public void testGetNombreAlumno() {
		String nombre = alumno.getNombre();
		assertEquals(nombre, "Kevin");
	}
	
	@Test
	public void testGetEjerciciosActividad() {
		Ejercicio ejc = new Ejercicio();
		ejc.setNombre("Ejercicio 01");
		assertEquals(ejc.getNombre(), a1.getEjercicios().get(0).getNombre());
	}
	
	@Test
	public void testGetActividadesAlumno() {
		ArrayList<Actividad> actsAlumno = new ArrayList<Actividad>();
		actsAlumno.add(a1);
		actsAlumno.add(a2);
		assertEquals(alumno.getActividadesAsignadas(), actsAlumno);
	}
	
	@Test
	public void testCalcularNotaActividadNula() {
		double nota = alumno.calcularNotaActividad("Actividad 00");
		assertEquals(0, nota, 0);
	}
	
	@Test
	public void testCalcularNotaActividadSinEjercicios() {
		double nota = alumno.calcularNotaActividad("Actividad 02");
		assertEquals(0, nota, 0);
	}
	
	@Test
	public void testCalcularsSumaNotaActividad() {
		double nota = alumno.calcularNotaActividad("Actividad 01");
		assertEquals(18, nota, 0);
	}
	
	@Test
	public void testActualizarNotaActividad() {
		alumno.calcularNotaActividad("Actividad 01");
		double nota = a1.getPuntuacionTotal();
		assertEquals(18, nota, 0);
	}
	
	@Test
	public void testActividadCalificadaApta() {
		assertEquals(alumno.getActividadesAsignadas().get(0).isApta(), true);
	}
}
