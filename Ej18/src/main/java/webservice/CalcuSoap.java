package webservice;

import javax.jws.WebService;

@WebService
public interface CalcuSoap {
	public int suma(int n1,int n2);
	public int resta(int n1, int n2);
	public int multiplica(int n1, int n2);
	public int divide(int n1, int n2);
}
