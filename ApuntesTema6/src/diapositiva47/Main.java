package diapositiva47;

import diapositiva47.cuenta.CuentaCorriente;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente cc1 = new CuentaCorriente("46545645X", "Vladi");
		
		Gestor g1 = new Gestor("Manolo", "666666666");
		
		CuentaCorriente cc2 = new CuentaCorriente("46546545T", "Pepe", g1);
		
		
		cc1.mostrarInformacion();
		cc2.mostrarInformacion();
		

	}

}
