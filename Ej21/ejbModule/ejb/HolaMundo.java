package ejb;

import javax.ejb.Stateless;

import iFace.HolaFace;
@Stateless
public class HolaMundo implements HolaFace{

	@Override
	public String Hola() {
		System.out.println("Prueba hola desde EJB");
		return "Prueba de EJB superada, Bienvenido";
	}

	@Override
	public int suma(int n1, int n2) {
		return n1 + n2;
	}
	
}
