package ual.hmis.sesion05.ejercicio6;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double nota = .0;

		for (Actividad act : actividadesAsignadas) {
			if (act.getNombre().equals(nombreActividad)) {
				for (Ejercicio ejc : act.getEjercicios()) {
					nota += ejc.getPuntuacion();
				}
				act.setPuntuacionTotal(nota);
				break;
			}
		}
		return nota;
	}

}
