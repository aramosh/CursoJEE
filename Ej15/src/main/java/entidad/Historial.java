package entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historiales")
public class Historial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int goles;
	private int tarjetasAmarillas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	public Historial(int id, int goles, int tarjetasAmarillas) {
		super();
		this.id = id;
		this.goles = goles;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	public Historial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Historial [id=" + id + ", goles=" + goles + ", tarjetasAmarillas=" + tarjetasAmarillas + "]";
	}
	
}
