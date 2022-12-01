package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

@Path("coches")
public class ControladorPersona {
	@SuppressWarnings("unused")
	private DaoCoche daoCoche;
	
	
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Response getCoche(@PathParam("id") int id) {
		daoCoche = new DaoCoche();
		Coche c = daoCoche.get(id-1);
		if(c != null) {
			return Response.status(Response.Status.OK).entity(c).build();
		}else {
			return Response.status(Response.Status.NOT_FOUND).entity(c).build();
		}
	}
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response altaCoche(Coche c) {
		daoCoche = new DaoCoche();
		daoCoche.add(c);
		return Response.status(Response.Status.CREATED).entity(c).build();
	}
}
