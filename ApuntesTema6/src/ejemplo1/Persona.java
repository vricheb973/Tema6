package ejemplo1;

public class Persona {

	// Atributos
	private int id;
	private String nombre;
	private int edad;
	private double estatura;
	private Coche coche;

	// Atributos estáticos
	private static int contadorId = 1;
	private static String nombreUltimaPersona;

	// Constructores
	public Persona() {
		this.id = Persona.contadorId++;
	}

	public Persona(String nombre, int edad, double estatura) {
		this.id = Persona.contadorId++;
		setNombre(nombre);
		setEdad(edad);
		setEstatura(estatura);

		Persona.nombreUltimaPersona = nombre;
	}

	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.isBlank() || nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 18) {
			throw new IllegalArgumentException("La edad debe ser mayor o igual a 18 años");
		}
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		if (estatura < 1.0) {
			throw new IllegalArgumentException("La estatura debe ser mayor o igual que 1 metro.");
		}
		this.estatura = estatura;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	// Métodos
	void saludar() {
		System.out.println("Hola, me llamo " + this.nombre);
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
