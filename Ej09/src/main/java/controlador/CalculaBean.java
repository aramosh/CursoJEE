package controlador;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculaBean {
	private int num1;
	private int num2;
	private int resultado;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public String sumar() {
		System.out.println("sumando");
		this.resultado = num1 + num2;
		System.out.println(this.getResultado());
		return null;
	}
	public String restar() {
		System.out.println("restando");
		this.resultado = num1 - num2;
		return null;
	}
	public String multiplicar() {
		System.out.println("multiplicando");
		this.resultado = num1 * num2;
		return null;
	}
	public String dividir() {
		System.out.println("dividiendo");
		if(num2 != 0) {
			this.resultado = num1/num2;
		}else {
			this.resultado = 0;
		}
		return null;
	}
	
}
