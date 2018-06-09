package ual.hmis.sesion05.ejercicio2;
public class Ejercicio2 {
	
	public boolean login(String username, String password) {
		//Comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty())
			 return false;
		
		//Comprobar que la longitud sea < 30
		 if (username.length() > 30 || password.length() > 30)
			 return false;
		 
		//Llamar al metodo de la BD
			 return compruebaLoginEnBD(username, password);
	}
	
	public boolean compruebaLoginEnBD(String username, String password) {
		//Metodo mock simulado
		if (username == "user" && password == "pass")
			return true;
		else
			return false;
	}
}
