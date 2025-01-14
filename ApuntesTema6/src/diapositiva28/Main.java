package diapositiva28;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente cc1 = new CuentaCorriente(null, "Vladi");
		
		cc1.ingresar(-20);
		
		cc1.mostrarInformacion();

	}

}
