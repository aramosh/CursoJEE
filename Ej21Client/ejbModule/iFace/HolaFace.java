package iFace;

import javax.ejb.Remote;

@Remote
public interface HolaFace {
	public String Hola();
	public int suma(int n1, int n2);
}
