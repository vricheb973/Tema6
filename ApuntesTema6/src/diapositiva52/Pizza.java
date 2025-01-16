package diapositiva52;

public class Pizza {
	
	//Atributos
	private Tamano tamano;
	private Tipo tipo;
	private Estado estado;
	
	//Atributos estáticos
	private static int pedidas = 0;
	private static int servidas = 0;
	
	//Constructores
	public Pizza(String tamano, String tipo) {
		setTamano(tamano);
		setTipo(tipo);
		this.estado = Estado.pedida;
		Pizza.pedidas++;
	}
	
	//Getters y setters
	public String getTamano() {
		return tamano.toString();
	}
	public void setTamano(String tamano) {
		this.tamano = Tamano.valueOf(tamano);
	}
	public String getTipo() {
		return tipo.toString();
	}
	public void setTipo(String tipo) {
		this.tipo = Tipo.valueOf(tipo);
	}
	public String getEstado() {
		return estado.toString();
	}
	
	//Getters y setters estáticos
	public static int getPedidas() {
		return Pizza.pedidas;
	}
	
	public static int getServidas() {
		return Pizza.servidas;
	}
	
	//Métodos
	public void servir() {
		if(this.estado.equals(Estado.servida)) {
			throw new IllegalStateException("La pizza ya estaba servida. ");
		}
		
		this.estado = Estado.servida;
		Pizza.servidas++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
