package entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jugadores")
public class Jugador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int dorsal;
	@OneToOne
	private Historial historial;
	@ManyToOne
	@JoinColumn(name="fk_equipo", referencedColumnName = "id")
	private Equipo equipo;
	
	public Historial getHistorial() {
		return historial;
	}
	public void setHistorial(Historial historial) {
		this.historial = historial;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public Jugador(int id, String nombre, int dorsal, Historial historial, Equipo equipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.historial = historial;
		this.equipo = equipo;
	}
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", dorsal=" + dorsal + ", historial=" + historial.getId()
				+ ", equipo=" + equipo.getId() + "]";
	}
	
}
