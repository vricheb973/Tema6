package wallapop;

import wallapop.enums.EstadoProducto;

public class Producto {
	
	private static int contadorCod = 1;
	
	private int codigo;
	private String nombre;
	private double precio;
	private EstadoProducto estadoProducto;
	
	public Producto(String nombre, double precio) {
		this.codigo = contadorCod++;
		this.nombre = nombre;
		this.precio = precio;
		this.estadoProducto = EstadoProducto.NUEVO;
	}
	
	public Producto(String nombre, double precio, String estadoProducto) {
		this.codigo = contadorCod++;
		this.nombre = nombre;
		this.precio = precio;
		setEstadoProducto(estadoProducto);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEstadoProducto() {
		return this.estadoProducto.toString();
	}
	
	public void setEstadoProducto(String estadoProducto) {
		this.estadoProducto = EstadoProducto.valueOf(estadoProducto);
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", estadoProducto="
				+ estadoProducto + "]";
	}

}
