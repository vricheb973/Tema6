package practicasClase.practica1;

import java.time.LocalDate;
import java.util.Random;

public class Tarea {
	
	//Atributos
	private int codigo;
	private EstadoTarea estado;
	private int numOrdenador;
	private Persona empleado;
	private String resolucion;
	private LocalDate fecha;

	//Estáticos
	private static int contadorCodigo = 1;
	
	//Constructores
	public Tarea(int numOrdenador) {
		this.codigo = Tarea.contadorCodigo++;
		this.estado = EstadoTarea.PENDIENTE;
		setNumOrdenador(numOrdenador);
	}

	//Getters y setters
	public int getCodigo() {
		return codigo;
	}

	public String getEstado() {
		return estado.toString();
	}

	public int getNumOrdenador() {
		return numOrdenador;
	}

	//Dejo este porque asumo que se puede cambiar el ordenador siempre que no esté resuelta
	public void setNumOrdenador(int numOrdenador) {
		if(this.estado.equals(EstadoTarea.RESUELTA)) {
			throw new IllegalArgumentException("No se puede cambiar el ordenador si la tarea está resuelta. ");
		}
		this.numOrdenador = numOrdenador;
	}

	public Persona getEmpleado() {
		return empleado;
	}

	public String getResolucion() {
		return resolucion;
	}

	//Dejo este porque asumo que podemos añadir o modificar la resolución del problema una vez resuelto.
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	//Métodos
	public void resolver(Persona p, String resolucion) {
		
		Random rand = new Random();
		long codigo = rand.nextLong(100000000000L, 1000000000000L);
		
		
		
		
		if(this.estado.equals(EstadoTarea.RESUELTA)) {
			throw new IllegalArgumentException("La tarea ya estaba resuelta. ");
		}
		this.empleado = p;
		this.resolucion = resolucion;
		this.fecha = LocalDate.now();
		this.estado = EstadoTarea.RESUELTA;
	}
	
	public void mostrarInformacion() {
		System.out.printf(" %d - %s - Nº PC: %d - Fecha: %s \n", 
				this.codigo, this.estado.toString(), this.numOrdenador, 
				this.fecha!=null?this.fecha.toString():"No resuelta. ");
	}		
	
}
