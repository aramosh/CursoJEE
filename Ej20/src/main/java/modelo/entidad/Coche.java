package modelo.entidad;

public class Coche {
	private int id;
	private String marca, tipo, matricula, color;
	private Double precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", tipo=" + tipo + ", matricula=" + matricula + ", color=" + color + ", precio=" + precio + "]";
	}
	public Coche(int id, String marca, String tipo, String matricula, String color, Double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.tipo = tipo;
		this.matricula = matricula;
		this.color = color;
		this.precio = precio;
	}
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
	
}
