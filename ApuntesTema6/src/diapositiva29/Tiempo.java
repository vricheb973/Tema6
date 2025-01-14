package diapositiva29;

import java.util.Scanner;

public class Tiempo {
	
	private int segundos;
	
	//Convertir de hh, mm y ss a segundos
	public Tiempo(int horas, int minutos, int segundos) {
		Scanner sc;
		this.segundos = horas*3600 + minutos*60 + segundos;
	}

	public void suma(Tiempo t) {
		this.segundos += t.segundos;
	}
	
	public void resta(Tiempo t) {
		this.segundos -= t.segundos;
	}
	
	//Convertimos segundos en hh, mm y ss
	public void mostrar() {
		int horas = this.segundos / 3600;
		int minutos = (this.segundos % 3600) / 60;
		int segundos = this.segundos % 60;
		
		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
	}


}
