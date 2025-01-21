package dipositiva63.personal;

import java.time.LocalDate;

public class JefeEstacion {
	
	private String nombre;
	private String dni;
	private LocalDate fechaNombramiento;
	
	public JefeEstacion(String nombre, String dni) {
		setNombre(nombre);
		setDni(dni);
		this.fechaNombramiento = LocalDate.now();
	}
	
	public JefeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
		setNombre(nombre);
		setDni(dni);
		this.fechaNombramiento = fechaNombramiento;
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
	
	public LocalDate getFechaNombramiento() {
		return this.fechaNombramiento;
	}
	
	//omito el set porque no tiene sentido modificar una fecha de nombramiento
	
	
	
	
	
	
	
	
	
	
	
	

}
