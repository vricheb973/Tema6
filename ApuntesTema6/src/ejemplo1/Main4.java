package ejemplo1;

public class Main4 {

	public static void main(String[] args) {


		Persona p1 = new Persona("vladi", 32, 2.0);		
		Persona p2 = new Persona("pepe", 35, 1.98);	
		
		
		Coche c1 = new Coche("8888MMM", "Diesel", 100);
		
		c1.setMatricula("4564MBB");
		
		System.out.println("La matrícula del coche es: " + c1.getMatricula());

	}

}
