package datos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidad.Libro;



public class Libros {

	public static void add(Libro l) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(l);
		et.commit();
		em.close();
	}
	
	public static void rem(Libro l) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(l);
		et.commit();
		em.close();
	}
	
	public static Libro get(int id) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Libro l = em.find(Libro.class, id);
		et.commit();
		em.close();
		return l;
	}
	
	public static void up(Libro l) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(l);
		et.commit();
		em.close();
	}
	public static void showAll() {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		Query q = em.createQuery("SELECT * FROM Libro l");
		@SuppressWarnings("unchecked")
		List<Libro> listaLibros = q.getResultList();
		em.close();
		for(Libro l: listaLibros) {
			System.out.println(l.toString());
		}
	}

	public static void createDataBase() {
		Libro l  = new Libro(0, "JK838293093","El Mozárabe","Jesus Sanchez Adalid", "1998-8-15", 30.5, 30.0);
		Libro l2 = new Libro(0, "HJ38491283","Un día sin mas","Anónimo", "1978-2-7", 3.5, 3.0);
		Libro l3 = new Libro(0, "HL22831029","Mira para arriba sin abrir la boca","Elena Nieto del Bosque", "2008-3-20", 20.1, 19.5);
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(l);
		em.persist(l2);
		em.persist(l3);
		et.commit();
		em.close();
	}
}