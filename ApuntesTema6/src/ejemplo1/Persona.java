package ejemplo1;

public class Persona {
	
	//Atributos
	int id;
	String nombre;
	int edad;
	double estatura;

	//Atributos estáticos
	static int contadorId = 1;
	static String nombreUltimaPersona;
	
	//Constructores
	public Persona() {
		this.id = Persona.contadorId++;
	}
	
	public Persona(String nombre, int edad, double estatura){
		if(nombre.isBlank() || nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		if(edad < 18) {
			throw new IllegalArgumentException("La edad debe ser mayor o igual a 18 años");
		}
		if(estatura < 1.0) {
			throw new IllegalArgumentException("La estatura debe ser mayor o igual que 1 metro.");
		}
		
		this.id = Persona.contadorId++;		
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		
		Persona.nombreUltimaPersona = nombre;
	}
	
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
		System.out.println("Mi ID es " + this.id);
		System.out.println("Mi nombre es " + this.nombre);
		System.out.println("Tengo " + this.edad + " años");
		System.out.println("Mido " + this.estatura + "m");
		System.out.println("El contador está " + Persona.contadorId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
