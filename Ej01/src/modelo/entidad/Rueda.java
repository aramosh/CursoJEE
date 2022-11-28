package modelo.entidad;

public class Rueda {
	private Double pulgadas;
	private String marca;
	public Double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(Double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Rueda [pulgadas=" + pulgadas + ", marca=" + marca + "]";
	}
	
}
