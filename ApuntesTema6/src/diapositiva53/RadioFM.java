package diapositiva53;

public class RadioFM {
	
	private double frecuencia;
	
	public RadioFM() {
		this.frecuencia = 80.0;
	}
	
	public RadioFM(double frecuencia) {
		if(frecuencia < 80 ) {
			this.frecuencia = 80.0;
		}
		else if(frecuencia > 108) {
			this.frecuencia = 108.0;
		}
		else {
			this.frecuencia = frecuencia;
		}
	}
	
	public void up() {
		this.frecuencia += 0.5;
		
		if(this.frecuencia > 108.0) {
			this.frecuencia = 80.0;
		}
	}
	
	public void down() {
		this.frecuencia -= 0.5;

		if(this.frecuencia < 80.0) {
			this.frecuencia = 108.0;
		}
	}
	
	public void display() {
		System.out.printf("Frecuencia: %.1fFM \n", this.frecuencia);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
