package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import entidad.Persona;

@Path("persona")
public class PersonaWS {
	@GET
	@Produces("application/json")
	public Persona getPersona() {
		Persona p = new Persona();
		p.setNombre("Luca Matapelo");
		p.setEdad(35);
		p.setGenero("confuso");
		p.setNacionalidad("mundo imaginario");
		
		return p;
	}
	
}
