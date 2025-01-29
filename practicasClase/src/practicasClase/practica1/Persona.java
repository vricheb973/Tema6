package practicasClase.practica1;

public class Persona {
	
	
	private String nombre;
	private String apellidos;
	private int codEmpleado;
	
	public Persona(String nombre, String apellidos, int codEmpleado) {
		setNombre(nombre);
		setApellidos(apellidos);
		setCodEmpleado(codEmpleado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}	
	
	public void mostrarInformacion() {
		System.out.printf("Cod: %d - Nombre: %s - Apellidos: %s \n", 
				this.codEmpleado, this.nombre, this.apellidos);
	}

}
