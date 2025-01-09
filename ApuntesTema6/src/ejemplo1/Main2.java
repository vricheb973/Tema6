package ejemplo1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.nombre = "vladi";
		p1.edad = 32;
		p1.estatura = 1.78;
		
		Persona p2 = new Persona();
		p2.nombre = "pepe";
		p2.edad = 35;
		p2.estatura = 1.98;

		p2.crecer(0.02);
		p1.crecer(0.03);
		
		
		
		
		

	}

}
