package entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String isbn;
	private String titulo,autor,fechaDePublicacion;
	private Double precio,precioConDescuento;


	public Libro(int id, String isbn, String titulo, String autor, String fechaDePublicacion, Double precio,
			Double precioConDescuento) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.fechaDePublicacion = fechaDePublicacion;
		this.precio = precio;
		this.precioConDescuento = precioConDescuento;
	}

	public Libro() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	public void setFechaDePublicacion(String fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}
	public Double getPrecioConDescuento() {
		return precioConDescuento;
	}
	public void setPrecioConDescuento(Double precioConDescuento) {
		this.precioConDescuento = precioConDescuento;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor
				+ ", fechaDePublicacion=" + fechaDePublicacion + ", precio=" + precio + ", precioConDescuento="
				+ precioConDescuento + "]";
	}
	
}