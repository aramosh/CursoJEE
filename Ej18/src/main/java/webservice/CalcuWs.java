package webservice;

import javax.jws.WebService;

@WebService
public class CalcuWs implements CalcuSoap{

	@Override
	public int suma(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public int resta(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public int multiplica(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public int divide(int n1, int n2) {
		if(n2 != 0) {
			return n1/n2;
		}else {
			return 0;
		}
	}

	
	
}
