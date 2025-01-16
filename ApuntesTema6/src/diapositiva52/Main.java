package diapositiva52;

public class Main {

	public static void main(String[] args) {

		Pizza p1 = new Pizza("MEDIANA", "FUNGHI");
		Pizza p2 = new Pizza("FAMILIAR", "PEPA");
		Pizza p3 = new Pizza("FAMILIAR", "CUATRO_QUESOS");

		System.out.println("Pedidas: " + Pizza.getPedidas());
		System.out.println("Servidas: " + Pizza.getServidas());
		
		p1.servir();
		
		System.out.println("Pedidas: " + Pizza.getPedidas());
		System.out.println("Servidas: " + Pizza.getServidas());
		
		p1.servir();
		
	}

}
