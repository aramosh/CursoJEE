package modelo.entidad;

import java.util.List;

import modelo.negocio.Pedido;

public class Pizza {
	private String size;
	private List<String> ingredientes;
	private int price;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = Pedido.calcular(this);
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", ingredientes=" + ingredientes + ", price=" + price + "]";
	}	
	
}
