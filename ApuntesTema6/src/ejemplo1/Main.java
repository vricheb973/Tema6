package ejemplo1;

public class Main {

	public static void main(String[] args) {		
				
		Coche c1 = new Coche();
		c1.matricula = "1111AAA";
		c1.combustible = "Gasolina";
		c1.kilometraje = 100;
				
		Coche c2 = new Coche();
		c2.matricula = "2222BBB";
		c2.combustible = "Diésel";
		c2.kilometraje = 200;
		
		Persona p = new Persona();
		
		p.edad = 32;	
		p.estatura = 1.76;
		
		System.out.println(p.edad);		

		p.saludar();
		p.cumplirAnios();
		
		System.out.println(p.edad);
		
		p.crecer();
		
		System.out.println(p.estatura);		
		
		
		
	}

}
