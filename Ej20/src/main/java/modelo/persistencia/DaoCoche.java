package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Coche;

public class DaoCoche {
	public static List<Coche> listaCoche;
	static {
		listaCoche = new ArrayList<Coche>();
		Coche c = new Coche(1,"Seat Ibiza","Turismo","GJK3423", "Blanco", 25000.00);
		listaCoche.add(c);
		c = new Coche(2,"Nissan Vito","Furgoneta","JSI3894", "Blanco", 35000.00);
		listaCoche.add(c);
		c = new Coche(3,"Mercedes LG3","Limussine","GHE3728", "Rosa", 135000.00);
		listaCoche.add(c);
		
	}
	
	public Coche get(int id) {
		try {
			return listaCoche.get(id);
		} catch (IndexOutOfBoundsException iobe) {
			System.out.println("Get -> Persona fuera de rango");
			return null;
		}
	}
	
	public List<Coche> list(){
		return listaCoche;
	}
	
	public void add(Coche c) {
		c.setId(listaCoche.size()+1);
		listaCoche.add(c);
	}
	
	public Coche del(int id) {
		try {
			return listaCoche.remove(id);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("del -> Coche fuera de rango");
			return null;
		}
	}
	public Coche update(Coche c) {
		try {
			Coche cAux = listaCoche.get( c.getId() );
			cAux.setMarca(c.getMarca());
			cAux.setMatricula(c.getMatricula());
			cAux.setTipo(c.getTipo());
			cAux.setPrecio(c.getPrecio());
			return cAux;
		}catch (IndexOutOfBoundsException e) {
			System.out.println("update -> Coche fuera de rango");
			return null;
		}
	}
	public List<Coche> listByMarca(String marca){
		List<Coche> listaAux = new ArrayList<Coche>();
		for(Coche c : listaCoche) {
			if(c.getMarca().equalsIgnoreCase(marca)) {
				listaAux.add(c);
			}
		}
		return listaAux;
	}
	
}
