package dipositiva63.personal;

public class Mecanico {
	
	private String nombre;
	private String telefono;
	private Especialidad especialidad;
	
	public Mecanico(String nombre, String telefono, String especialidad) {
		setNombre(nombre);
		setTelefono(telefono);
		setEspecialidad(especialidad);
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		if (telefono == null || telefono.isBlank()) {
			throw new IllegalArgumentException("El telefono no puede ser vacío, ni en blanco, ni nulo");
		}
		this.telefono = telefono;
	}
	public String getEspecialidad() {
		return especialidad.toString();
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = Especialidad.valueOf(especialidad);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
