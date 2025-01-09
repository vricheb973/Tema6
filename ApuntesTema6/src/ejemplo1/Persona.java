package ejemplo1;

public class Persona {
	
	//Atributos
	String nombre;
	int edad;
	double estatura;
	
	//Constructores
	
	//Métodos
	void saludar() {
		System.out.println("Hola, me llamo " + this.nombre );
	}
	
	void cumplirAnios() {
		this.edad++;
	}
	
	void crecer() {
		this.estatura += 0.01;
	}
	
	void crecer(double estatura) {
		this.estatura += estatura;
	}
	
	void presentarse() {
		System.out.println("Mi nombre es " + this.nombre);
		System.out.println("Tengo " + this.edad + " años");
		System.out.println("Mido " + this.estatura + "m");
	}
	
	
	
	
	
	

}
