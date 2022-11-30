package controlador;

import datos.Libros;
import entidad.Libro;

public class Main {

	public static void main(String[] args) {
		//cargamos la base de datos
		Libros.createDataBase();
		
		//añadimos un libro
		Libro l = new Libro();
		l.setTitulo("me invento otra cosa");
		l.setIsbn("NG93849092-83-9037");
		l.setPrecio(43.5);
		l.setPrecioConDescuento(43.0);
		l.setFechaDePublicacion("ayer");
		l.setAutor("Yo no fuí");
		//persisto en la base de datos
		Libros.add(l);
		//obtengo un libro persistido
		Libro l2 = Libros.get(2);
		l2.setPrecioConDescuento(4.0);
		//modifico el libro y persisto el cambio
		Libros.up(l2);
		//añado un libro vacío a la base de datos
		Libros.add(new Libro());
		//obtengo el nuevo libro
		Libro l5 = Libros.get(5);
		//lo borro ya que estará vacío
		Libros.rem(l5);
	}

}
