package controlador;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entidad.Equipo;
import entidad.Historial;
import entidad.Jugador;

public class Main {

	public static void main(String[] args) {
		Jugador j1 = new Jugador();
		j1.setDorsal(2);
		j1.setNombre("Marco el de la foto");
		Historial h1 = new Historial();
		h1.setGoles(25);
		h1.setTarjetasAmarillas(3);
		j1.setHistorial(h1);
		Jugador j2 = new Jugador();
		j2.setDorsal(4);
		j2.setNombre("El de al lado de Marco");
		Historial h2 = new Historial();
		h2.setGoles(3);
		h2.setTarjetasAmarillas(5);
		j2.setHistorial(h2);
		Equipo e1 = new Equipo();
		e1.setEstadio("El patio del colegio");
		e1.setNombre("Mi cole FC");
		j1.setEquipo(e1);
		j2.setEquipo(e1);
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		e1.setJugadores(jugadores);
		
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e1);
		em.persist(j1);
		em.persist(h1);
		em.persist(j2);
		em.persist(h2);
		et.commit();
		em.close();
		
	}

}
