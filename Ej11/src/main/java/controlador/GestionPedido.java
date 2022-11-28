package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import modelo.entidad.Cliente;
import modelo.entidad.Pizza;
import modelo.negocio.Pedido;

@ManagedBean
@SessionScoped
public class GestionPedido {
	private Pedido pedido = new Pedido();
	private Pizza pizza = new Pizza();
	private Cliente cliente = new Cliente();
	
	@ManagedProperty(value="#{pidiendo}")
	private Pidiendo pedidos;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Pidiendo getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pidiendo pedidos) {
		this.pedidos = pedidos;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String pedirPizza() {
		pedido.setCliente(cliente);
		pizza.setPrice(Pedido.calcular(pizza));
		pedido.getPizzas().add(pizza);
		pizza = new Pizza();
		pedidos.setPedidos(pedidos.getPedidos()+1);
		return null;
	}
	public String resultado() {
		if(pedido.getPizzas().size() == 0) {
			return null;
		}else {
			return "resultado";
		}
	}

	public String borra() {
		pedido = new Pedido();
		return "borrado";
	}
}
