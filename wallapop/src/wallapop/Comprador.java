package wallapop;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
	
	private String nombre;
	private List<Producto> comprados;
	private double dineroDisponible;
	
	public Comprador(String nombre) {
		this.nombre = nombre;
		this.dineroDisponible = 0.0;
		this.comprados = new ArrayList<Producto>();
	}
	
	public Comprador(String nombre, double dineroDisponible) {
		this.nombre = nombre;
		this.dineroDisponible = dineroDisponible;
		this.comprados = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getComprados() {
		return comprados;
	}

	public void setComprados(List<Producto> comprados) {
		this.comprados = comprados;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
	
	//Métodos
	public void addProducto(Producto p) {
		//Que no sea nulo
		if(p == null) {
			throw new IllegalArgumentException("El producto no puede ser nulo. ");
		}
		//Que el producto no esté ya en la lista
		for(Producto prod : this.comprados) {
			if(prod.getCodigo() == p.getCodigo()) {
				throw new IllegalArgumentException("El producto ya está en la lista. ");
			}
		}
		this.comprados.add(p);				
	}
	
	public void removeProducto(Producto p) {
		//Que no sea nulo
		if(p == null) {
			throw new IllegalArgumentException("El producto no puede ser nulo. ");
		}
		//Que el producto esté en la lista
		boolean esta = false;
		for(Producto prod : this.comprados) {
			if(prod.getCodigo() == p.getCodigo()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("El producto no está en la lista. ");
		}
		this.comprados.remove(p);
	}
	
	public void removeProducto(int i) {
		//Que la posición indicada (i) existe en la lista
		if(i<0 || i>=this.comprados.size()) {
			throw new IllegalArgumentException("La posición no existe en la lista. ");
		}
		this.comprados.remove(i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
