package wallapop;

public class Trato {
	
	private Comprador comprador;
	private Vendedor vendedor;
	private Producto producto;
	
	private boolean firmaComprador;
	private boolean firmaVendedor;
	
	public Trato(Comprador comprador, Vendedor vendedor, Producto producto) {
		setProducto(producto);
		setComprador(comprador);
		setVendedor(vendedor);
		this.firmaComprador = false;
		this.firmaVendedor = false;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		if(this.firmaComprador && this.firmaVendedor) {
			throw new IllegalArgumentException("No se puede cambiar el comprador en un trato validado. ");
		}
		if(comprador.getDineroDisponible() < this.producto.getPrecio()) {
			throw new IllegalArgumentException("El comprador no tiene dinero suficiente. ");
		}
		this.comprador = comprador;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		if(this.firmaComprador && this.firmaVendedor) {
			throw new IllegalArgumentException("No se puede cambiar el comprador en un trato validado. ");
		}
		if(!vendedor.estaProductoEnVenta(this.producto)) {
			throw new IllegalArgumentException("El producto no está en el inventario del vendedor. ");
		}
		this.vendedor = vendedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		if(this.firmaComprador && this.firmaVendedor) {
			throw new IllegalArgumentException("No se puede cambiar el comprador en un trato validado. ");
		}
		this.producto = producto;
	}
	
	public void validar(Comprador c) {
		//Validar que c es el comprador del trato
		//Que no esté validado ya
		//Pongo la firma del comprador a true
		
		//Si el vendedor también ha firmado, movemos los productos
	}
	
	public void validar(Vendedor v) {
		//Validar que v es el vendedor del trato
		//Que no esté validado ya
		//Pongo la firma del vendedor a true
		
		//Si el comprador también ha firmado, movemos los productos
	}
	
	
	
	
	
	
	
	
	

}
