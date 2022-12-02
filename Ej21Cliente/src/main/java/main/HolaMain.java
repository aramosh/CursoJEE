package main;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import iFace.HolaFace;

public class HolaMain {
	private static String JNDI_EJB = "ejb:Ej21EAR/Ej21/HolaMundo!iFace.HolaFace";
	public static void main(String[] args) throws NamingException{
		System.out.println("Arrancando cliente EJB Stateless");

		Properties prop = cargarPropiedadesConexion();
		Context context = new InitialContext(prop);
		HolaFace hf = (HolaFace) context.lookup(JNDI_EJB);
		
		System.out.println(hf.Hola());
		System.out.println("La suma de 3 y 5 es "+hf.suma(3, 5));
		
		System.out.println("Fin cliente EJB Stateless");
	}
	public static Properties cargarPropiedadesConexion() {
		Properties prop = new Properties();
		//Establecemos la factoria de clases para conectarnos
		prop.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.wildfly.naming.client.WildFlyInitialContextFactory");
		//Definimos el esquema de conexión
		prop.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		return prop;
	}
}
