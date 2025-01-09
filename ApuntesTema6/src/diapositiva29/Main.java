package diapositiva29;

public class Main {

	public static void main(String[] args) {

		Tiempo t1 = new Tiempo(1, 20, 30);
		Tiempo t2 = new Tiempo(0, 62, 20);
		
		t1.suma(t2);
		
		t1.mostrar();

	}

}
