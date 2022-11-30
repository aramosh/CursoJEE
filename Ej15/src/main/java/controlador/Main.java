package controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidad.Equipo;
import entidad.Historial;
import entidad.Jugador;
import modelo.Datos;

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
		
		//cargo mas datos en la base de datos
		Datos.cargar(factoria);	
		//consultas JPQL
		System.out.println("============== Consultas JPQL ================");
		System.out.println("============== Jugadores que con nombre empieaza por M ================");
		Query q = em.createQuery("SELECT j FROM Jugador j WHERE j.nombre LIKE 'M%'");
		@SuppressWarnings("unchecked")
		List<Jugador> l = q.getResultList();
		for(Jugador j: l) {
			System.out.println("id: "+j.getId()+" nombre: "+j.getNombre());
		}
		System.out.println("============== Jugadores del equipo 'Huelin'================");
		q = em.createQuery("SELECT e FROM Equipo e WHERE e.nombre LIKE 'Huelin'");
		Equipo e = (Equipo) q.getSingleResult();
		q = em.createQuery("SELECT j FROM Jugador j WHERE j.equipo LIKE "+e.getId());
		@SuppressWarnings("unchecked")
		List<Jugador> l2 = q.getResultList();
		for(Jugador j: l2) {
			System.out.println("Id: "+j.getId()+" Nombre: "+j.getNombre()+" Dorsal: "+j.getDorsal());
		}
		System.out.println("============== 3 Jugadores que mas goles han metido================");
		q = em.createQuery("SELECT h FROM Historial h ORDER BY h.goles DESC");
		q.setMaxResults(3);
		@SuppressWarnings("unchecked")
		List<Historial> lh = q.getResultList();
		for(Historial h: lh) {
			q = em.createQuery("SELECT j FROM Jugador j WHERE j.historial LIKE "+h.getId());
			Jugador j = (Jugador) q.getSingleResult();
			System.out.println("Id: "+j.getId()+" Nombre: "+j.getNombre()+" Goles: "+ h.getGoles());
		}
		em.close();
	}

}
