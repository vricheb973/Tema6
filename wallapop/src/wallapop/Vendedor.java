package wallapop;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
	
	private String nombre;
	private List<Producto> enVenta;
	private List<Producto> vendidos;
	
	public Vendedor(String nombre) {
		this.nombre = nombre;
		this.enVenta = new ArrayList<Producto>();
		this.vendidos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getEnVenta() {
		return enVenta;
	}

	public void setEnVenta(List<Producto> enVenta) {
		this.enVenta = enVenta;
	}

	public List<Producto> getVendidos() {
		return vendidos;
	}

	public void setVendidos(List<Producto> vendidos) {
		this.vendidos = vendidos;
	}

	//Métodos
	//EN VENTA
	public void addProductoEnVenta(Producto p) {
		//Que no sea nulo
		if(p == null) {
			throw new IllegalArgumentException("El producto no puede ser nulo. ");
		}
		//Que el producto no esté ya en la lista
		for(Producto prod : this.enVenta) {
			if(prod.getCodigo() == p.getCodigo()) {
				throw new IllegalArgumentException("El producto ya está en venta. ");
			}
		}
		this.enVenta.add(p);				
	}
	
	public void removeProductoEnVenta(Producto p) {
		//Que no sea nulo
		if(p == null) {
			throw new IllegalArgumentException("El producto no puede ser nulo. ");
		}
		//Que el producto esté en la lista
		boolean esta = false;
		for(Producto prod : this.enVenta) {
			if(prod.getCodigo() == p.getCodigo()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("El producto no está en venta. ");
		}
		this.enVenta.remove(p);
	}
	
	public void removeProductoEnVenta(int i) {
		//Que la posición indicada (i) existe en la lista
		if(i<0 || i>=this.enVenta.size()) {
			throw new IllegalArgumentException("La posición no existe en la lista de productos en venta. ");
		}
		this.enVenta.remove(i);
	}
	
	//VENDIDOS
	public void addProductoVendidos(Producto p) {
		//Que no sea nulo
		if(p == null) {
			throw new IllegalArgumentException("El producto no puede ser nulo. ");
		}
		//Que el producto no esté ya en la lista
		for(Producto prod : this.vendidos) {
			if(prod.getCodigo() == p.getCodigo()) {
				throw new IllegalArgumentException("El producto ya está vendido. ");
			}
		}
		this.vendidos.add(p);				
	}
	
	public void removeProductoVendidos(Producto p) {
		//Que no sea nulo
		if(p == null) {
			throw new IllegalArgumentException("El producto no puede ser nulo. ");
		}
		//Que el producto esté en la lista
		boolean esta = false;
		for(Producto prod : this.vendidos) {
			if(prod.getCodigo() == p.getCodigo()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("El producto no está en la lista de vendidos. ");
		}
		this.vendidos.remove(p);
	}
	
	public void removeProductoVendidos(int i) {
		//Que la posición indicada (i) existe en la lista
		if(i<0 || i>=this.enVenta.size()) {
			throw new IllegalArgumentException("La posición no existe en la lista de productos en venta. ");
		}
		this.enVenta.remove(i);
	}
	
	public boolean estaProductoEnVenta(Producto producto) {
		boolean existe = false;
		
		for(Producto p : this.enVenta) {
			if(p.getCodigo() == producto.getCodigo()) {
				existe = true;
			}
		}

		return existe;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
