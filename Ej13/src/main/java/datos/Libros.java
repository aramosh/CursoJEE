package datos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidad.Libro;



public class Libros {
	private static EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
	public static void add(Libro l) {
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(l);
		et.commit();
		em.close();
		showAll();
		System.out.println("====Libro añadido con id "+l.getId()+"====");
	}
	
	public static void rem(Libro l) {
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Libro l2rem = em.find(Libro.class, l.getId());
		em.remove(l2rem);
		et.commit();
		em.close();
		showAll();
		System.out.println("====Libro borrado con id "+l.getId()+"====");
	}
	/**
	 * Busca el libro por id, si no existe retorna un objeto Libro vacío con el id indicado
	 * @param id
	 * @return
	 */
	public static Libro get(int id) {
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Libro l = em.find(Libro.class, id);
		et.commit();
		em.close();
		if(l == null) {
			System.out.println("no existe el libro con id "+id);
			l = new Libro();
			l.setId(id);
		}
		return l;
	}
	
	public static void up(Libro l) {
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(l);
		et.commit();
		em.close();
		showAll();
		System.out.println("====Libro modificado con id "+l.getId()+"====");
	}
	public static void showAll() {
		EntityManager em = factoria.createEntityManager();
		Query q = em.createQuery("SELECT l FROM libros l");
		@SuppressWarnings("unchecked")
		List<Libro> listaLibros = q.getResultList();
		em.close();
		System.out.println("===================== showALL ====================");
		for(Libro l: listaLibros) {
			System.out.println(l.toString());
		}
	}
/**
 * Función estática que crea la tabla de libros en la base de datos para que estén a disposición del ejercicio
 */
	public static void createDataBase() {
		Libro l  = new Libro(0, "JK838293093","El Mozárabe","Jesus Sanchez Adalid", "1998-8-15", 30.5, 30.0);
		Libro l2 = new Libro(0, "HJ38491283","Un día sin mas","Anónimo", "1978-2-7", 3.5, 3.0);
		Libro l3 = new Libro(0, "HL22831029","Mira para arriba sin abrir la boca","Elena Nieto del Bosque", "2008-3-20", 20.1, 19.5);
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