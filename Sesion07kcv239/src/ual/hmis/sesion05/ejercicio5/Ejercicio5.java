package ual.hmis.sesion05.ejercicio5;
public class Ejercicio5 {
	
	public String subcadenahastaPunto(String cadena) {
		if (!cadena.contains(".")) return "Error: cadena sin punto";
		
		String s[] = cadena.split("[.]");
		String s1 = s[0];
		
		for (int i = 0; i<s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) return "Error: cadena con digito";
		}
		return s1 + ".";
	}
}
