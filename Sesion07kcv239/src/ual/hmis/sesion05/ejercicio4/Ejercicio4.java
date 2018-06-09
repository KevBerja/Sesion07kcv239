package ual.hmis.sesion05.ejercicio4;
public class Ejercicio4 {
	
	public String comprobarEntrada(String p1, String p2) {
		
		String s = "";
		char c;
		if (p1 == null && p2 == null) {
			return "Es nulo";
		} else {
		if (p1 != null && p2 != null) {
			for (int i = 0; i < p1.length(); i++) {
				c = p1.charAt(i);
				for (int j = 0; j < p2.length(); j++) {
					if (c == p2.charAt(j)) {
						continue;
					} else {
						if (!p2.contains(String.valueOf(c)) && !s.contains(String.valueOf(c))) {
							s += c;
						}
					}
				}
			}
		}
		}
		return s;
	}
}
