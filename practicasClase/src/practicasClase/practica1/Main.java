package practicasClase.practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		menu();

	}
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		List<Tarea> tareas = new ArrayList<Tarea>();
		List<Persona> personas = new ArrayList<Persona>();
		
		int opcion;
		
		do {

			System.out.println("1. Ver tareas");
			System.out.println("2. Crear tarea");
			System.out.println("3. Resolver tarea");
			System.out.println("4. Ver empleados");
			System.out.println("5. Crear empleado");
			System.out.println("6. Salir");
			
			opcion = sc.nextInt();
			
			System.out.println("-------------------------");
			
			switch(opcion) {
			case 1:
				verTareas(tareas);
				System.out.println("-------------------------");
				break;
			case 2:
				tareas.add(crearTarea(sc));
				System.out.println("Tarea añadida.");
				System.out.println("-------------------------");
				break;
			case 3:
				
				System.out.println("-------------------------");
				break;
			case 4:
				verPersonas(personas);
				System.out.println("-------------------------");
				break;
			case 5:
				personas.add(crearPersona(sc));
				System.out.println("Persona añadida.");
				System.out.println("-------------------------");
				break;
			default:
				System.out.println("Saliendo...");
				break;
			}
			
		}
		while(opcion > 0 && opcion <= 5);
		
	}
	
	public static void verTareas(List<Tarea> tareas) {
		for(Tarea t : tareas) {
			t.mostrarInformacion();
		}
	}
	
	public static Tarea crearTarea(Scanner sc) {
		System.out.println("Número del ordenador: ");
		int numOrdenador = sc.nextInt();
	
		return new Tarea(numOrdenador);
	}
	
	public static void verPersonas(List<Persona> personas) {
		for(Persona p : personas) {
			p.mostrarInformacion();
		}
	}
	
	public static Persona crearPersona(Scanner sc) {
		System.out.print("Nombre: ");
		String nombre = sc.next();

		System.out.print("Apellidos: ");
		String apellidos = sc.next();

		System.out.print("Código empleado: ");
		int codigo = sc.nextInt();
	
		return new Persona(nombre, apellidos, codigo);
	}
	
	public static void resolverTarea(Scanner sc, List<Tarea> tareas, List<Persona> personas) {
		System.out.print("Código tarea: ");
		int codigoTarea = sc.nextInt();
		
		System.out.print("Código empleado: ");
		int codigoEmpleado = sc.nextInt();
		
		boolean existeTarea = false;
		Persona empleado = null;
		
		for(Tarea t : tareas) {
			if(t.getCodigo() == codigoTarea) {
				existeTarea = true;
			}
		}

		for(Persona p : personas) {
			if(p.getCodEmpleado() == codigoEmpleado) {
				empleado = p;
			}
		}
		
//		if(!existeTarea) {
//			
//		}
//		if(!)
		
	}

}
