package dipositiva63.maquinaria;

import java.time.LocalDate;

import dipositiva63.personal.Mecanico;

public class Locomotora {
	
	private String matricula;
	private int potencia;
	private short anoFabricacion;
	private Mecanico mecanico;
	
	public Locomotora(String matricula, int potencia, short anoFabricacion, Mecanico mecanico) {
		setMatricula(matricula);
		setPotencia(potencia);
		setAnoFabricacion(anoFabricacion);
		setMecanico(mecanico);
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if (matricula == null || matricula.isBlank()) {
			throw new IllegalArgumentException("El matrícula no puede ser vacío, ni en blanco, ni nulo");
		}
		this.matricula = matricula;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		if(potencia < 100) {
			throw new IllegalArgumentException("La potencia mínima son 100 CV. ");
		}
		this.potencia = potencia;
	}
	public short getAnoFabricacion() {
		return anoFabricacion;
	}
	public void setAnoFabricacion(short anoFabricacion) {
		if(anoFabricacion < 1980 || anoFabricacion > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("El año tiene que ser válido. ");
		}
		this.anoFabricacion = anoFabricacion;
	}
	
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		if(mecanico == null) {
			throw new IllegalArgumentException("El mécanico no puede ser nulo. ");
		}
		this.mecanico = mecanico;
	}
	
	public int getAntiguedad() {
		return LocalDate.now().getYear() - this.anoFabricacion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
