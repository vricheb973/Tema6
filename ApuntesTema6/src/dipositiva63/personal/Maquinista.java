package dipositiva63.personal;

public class Maquinista {
	
	private String nombre;
	private String dni;
	private double sueldo;
	private String rango;
	
	public Maquinista(String nombre, String dni, double sueldo, String rango) {
		setDni(dni);
		setNombre(nombre);
		setSueldo(sueldo);
		setRango(rango);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		if(dni == null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI no es válido. Debe tener 9 caracteres. ");
		}
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		if(sueldo < 1080) {
			throw new IllegalArgumentException("Págame más. ");
		}
		this.sueldo = sueldo;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		if (rango == null || rango.isBlank()) {
			throw new IllegalArgumentException("El rango no puede ser vacío, ni en blanco, ni nulo");
		}
		this.rango = rango;
	}
	
	

}
