package main;

import java.util.ArrayList;

import modelo.entidad.Coche;
import modelo.entidad.Motor;
import modelo.entidad.Rueda;

public class Concesionario {

	public static void main(String[] args) {
		
		Coche c = new Coche();
		c.setMarca("Citröen C4");
		c.setMatricula("GJD3982");
		c.setColor("rojo");
		c.setTipo("turismo");
		
		Motor m = new Motor();
		m.setCv(115);
		m.setConsumo(14.5);
		m.setTipoMotor("Diesel");
		
		Rueda dd = new Rueda();
		dd.setMarca("pirelli");
		dd.setPulgadas(50.0);
		Rueda di = new Rueda();
		dd.setMarca("pirelli");
		dd.setPulgadas(50.0);
		Rueda td = new Rueda();
		dd.setMarca("michelin");
		dd.setPulgadas(50.0);
		Rueda ti = new Rueda();
		dd.setMarca("michelin");
		dd.setPulgadas(50.0);
		ArrayList<Rueda> ruedas = new ArrayList<Rueda>();
		
		ruedas.add(dd);
		ruedas.add(di);
		ruedas.add(td);
		ruedas.add(ti);
		
		c.setMotor(m);
		c.setRuedas(ruedas);
		
		System.out.println(c);
	}

}
