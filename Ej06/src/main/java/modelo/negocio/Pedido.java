package modelo.negocio;

import modelo.entidad.Pizza;

public class Pedido {
	public static int calcular(Pizza p) {
		int precio = 0;
		//compruebo que se ha seleccionado un tamaño
		if(p.getSize() != ""){
			//establecemos el precio base
			switch(p.getSize()){
				case "peque":
					precio = 5;
					break;
				case "mediana":
					precio = 10;
					break;
				case "grande":
					precio = 15;
					break;
				default:
					break;
			}
			precio = precio + p.getIngredientes().size()*1;			
		}else{
			precio = -1;
		}
		return precio;
	}
}
