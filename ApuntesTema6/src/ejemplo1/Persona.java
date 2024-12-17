package ejemplo1;

public class Persona {
	
	String nombre;
	int edad;
	double estatura;
	
	void saludar() {
		System.out.println("Hola, me llamo " + nombre );
	}
	
	void cumplirAnios() {
		edad++;
	}
	
	void crecer() {
		estatura += 0.01;
	}
	
	void crecer(double incremento) {
		estatura += incremento;
	}
	
	
	
	
	
	

}
