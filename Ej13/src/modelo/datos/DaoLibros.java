package modelo.datos;

import java.util.List;

import modelo.entidad.Libro;

public class DaoLibros {
	List<Libro> libros;

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	public DaoLibros() {
		Libro l1 = new Libro(1,"DF5432165-34-54453","Por la cara de otro","Perico de Palmones","15/10/1935",50.0,45.0);
		Libro l2 = new Libro(2,"OK5653235-58-56256","La vereda de atras","Elena Nieto del Bosque","8/3/2002",30.0,25.0);
		Libro l3 = new Libro(3,"FH5265165-27-86548","Mirando pa' lo hondo","Juanito Infinito","20/11/2015",55.0,45.0);
		libros.add(l1);
		libros.add(l2);
		libros.add(l3);		
	}
}
