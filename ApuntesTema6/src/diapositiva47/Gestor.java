package diapositiva47;

public class Gestor {
	
	//Atributos
	private String nombre;
	private String telefono;
	private double importeMaximo;
	
	//Constructores
	public Gestor(String nombre, String telefono) {
		setNombre(nombre);
		setTelefono(telefono);
		this.importeMaximo = 10000.0;
	}
	
	public Gestor(String nombre, String telefono, double importeMaximo) {
		setNombre(nombre);
		setTelefono(telefono);
		setImporteMaximo(importeMaximo);
	}
	
	//Get/Set
	//Lectura
	public String getNombre() {
		return nombre;
	}
	//Modificaciones
	public void setNombre(String nombre) {
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser nulo, vacío o en blanco. ");
		}
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}
	
	private void setTelefono(String telefono) {
		if(telefono == null || telefono.isBlank()) {
			throw new IllegalArgumentException("El telefono no puede ser nulo, vacío o en blanco. ");
		}
		this.telefono = telefono;
	}

	public double getImporteMaximo() {
		return importeMaximo;
	}

	public void setImporteMaximo(double importeMaximo) {
		if(importeMaximo < 100.0) {
			throw new IllegalArgumentException("El mínimo debe ser 100 €. ");
		}
		this.importeMaximo = importeMaximo;
	}
	
	
	//Métodos

}
