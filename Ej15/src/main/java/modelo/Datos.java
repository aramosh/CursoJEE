package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidad.Equipo;
import entidad.Historial;
import entidad.Jugador;

public class Datos {
	public static void cargar(EntityManagerFactory factoria) {
		//equipos
		Equipo e2 = new Equipo(0,"La paz","Pajaritos");
		Equipo e3 = new Equipo(0,"Huelin","La princesa");
		//jugadores
		Historial h3 = new Historial(0,12,4);
		Jugador j3 = new Jugador(0,"Manolo Bombo",23,h3,e2);
		Historial h4 = new Historial(0,10,2);
		Jugador j4 = new Jugador(0,"Perico Palotes",13,h4,e2);
		Historial h5 = new Historial(0,5,3);
		Jugador j5 = new Jugador(0,"Mario Rosa",11,h5,e3);
		Historial h6 = new Historial(0,6,1);
		Jugador j6 = new Jugador(0,"Luca Peluca",7,h6,e3);
		Historial h7 = new Historial(0,17,5);
		Jugador j7 = new Jugador(0,"Mario Primote",18,h7,e3);
		
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e2);
		em.persist(e3);
		em.persist(j3);
		em.persist(j4);
		em.persist(j5);
		em.persist(j6);
		em.persist(j7);
		em.persist(h3);
		em.persist(h4);
		em.persist(h5);
		em.persist(h6);
		em.persist(h7);
		et.commit();
		em.close();
	}
}
