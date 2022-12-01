package main;

import ws.client.CalcuSoap;
import ws.client.CalcuWsService;

public class CalcuMain {
	public static void main(String[] args) {
		CalcuWsService service = new CalcuWsService();
		CalcuSoap cs = service.getCalcuWsPort();
		System.out.println("Suma 3 y 6 : " + cs.suma(3, 6));
		System.out.println("Resta 5 y 2 : " + cs.resta(5, 2));
		System.out.println("Multiplica 4 y 5 : " + cs.multiplica(4, 5));
		System.out.println("Divide 6 y 3 : " + cs.divide(6, 3));
	}
}
