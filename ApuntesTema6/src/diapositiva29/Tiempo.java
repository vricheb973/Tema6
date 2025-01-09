package diapositiva29;

public class Tiempo {
	
	int segundos;
	
	public Tiempo(int horas, int minutos, int segundos) {
		this.segundos = horas*3600 + minutos*60 + segundos;
	}

	void suma(Tiempo t) {
		this.segundos += t.segundos;
	}
	
	void resta(Tiempo t) {
		this.segundos -= t.segundos;
	}
	
	void mostrar() {
		int horas = this.segundos / 3600;
		int minutos = (this.segundos % 3600) / 60;
		int segundos = this.segundos % 60;
		
		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
	}


}
