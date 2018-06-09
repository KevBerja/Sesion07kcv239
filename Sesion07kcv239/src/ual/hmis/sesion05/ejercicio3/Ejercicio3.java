package ual.hmis.sesion05.ejercicio3;
public class Ejercicio3 {
	
	public String asteriscos(int x) {
		
		String s = "";
		if (x>=0) 
			for (int i = 0; i<x; i++) {
				s+="*";
			}
		else
			s = "Numero erroneo";
		return s;
	}
}
