package dipositiva63.maquinaria;

public class Vagon {
	
	private int numero;
	private double cargaActual;	
	private double cargaMaxima;
	private String tipoMercancia;
	
	private static int contadorNum = 1;
	
	public Vagon(double cargaActual, double cargaMaxima, String tipoMercancia) {
		this.numero = Vagon.contadorNum++;
		setCargaMaxima(cargaMaxima);
		setCargaActual(cargaActual);
		setTipoMercancia(tipoMercancia);
	}
	
	public int getNumero() {
		return numero;
	}

	public double getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(double cargaActual) {
		if(cargaActual > this.cargaMaxima) {
			throw new IllegalArgumentException("La carga excede la carga máxima");
		}
		this.cargaActual = cargaActual;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		if(this.cargaMaxima < 1000.0) {
			throw new IllegalArgumentException("No se permiten vagones de menos de 1000 kg. ");
		}
		this.cargaMaxima = cargaMaxima;
	}

	public String getTipoMercancia() {
		return tipoMercancia;
	}

	public void setTipoMercancia(String tipoMercancia) {
		if (tipoMercancia == null || tipoMercancia.isBlank()) {
			throw new IllegalArgumentException("El tipo de mercancia no puede ser vacío, ni en blanco, ni nulo");
		}
		this.tipoMercancia = tipoMercancia;
	}

}
