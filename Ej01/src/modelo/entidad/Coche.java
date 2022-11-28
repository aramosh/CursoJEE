package modelo.entidad;

import java.util.ArrayList;

public class Coche {

	private String marca, tipo, matricula, color;
	private Motor motor;
	private Double precio;
	private ArrayList<Rueda> ruedas;
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
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public ArrayList<Rueda> getRuedas() {
		return ruedas;
	}
	public void setRuedas(ArrayList<Rueda> ruedas) {
		this.ruedas = ruedas;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", tipo=" + tipo + ", matricula=" + matricula + ", color=" + color + ", motor="
				+ motor + ", precio=" + precio + ", ruedas=" + ruedas + "]";
	}	
	
}
