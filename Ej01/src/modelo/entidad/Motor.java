package modelo.entidad;

public class Motor {
	private int cv;
	private String tipoMotor;
	private Double consumo;
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public Double getConsumo() {
		return consumo;
	}
	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}
	@Override
	public String toString() {
		return "Motor [cv=" + cv + ", tipoMotor=" + tipoMotor + ", consumo=" + consumo + "]";
	}
	
}
