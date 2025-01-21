package dipositiva63.maquinaria;

import java.util.ArrayList;
import java.util.List;

import dipositiva63.personal.Maquinista;

public class Tren {
	
	private Locomotora locomotora;
	private Maquinista maquinista;
	private List<Vagon> vagones; 
	
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		setLocomotora(locomotora);
		setMaquinista(maquinista);		
		this.vagones = new ArrayList<Vagon>();
	}
	
	public Locomotora getLocomotora() {
		return locomotora;
	}
	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}
	public Maquinista getMaquinista() {
		return maquinista;
	}
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	
	public void addVagon(Vagon v) {
		if(v == null) {
			throw new IllegalArgumentException("El vagón no puede ser null. ");
		}		
		if(this.vagones.size() >= 5) {
			throw new IllegalArgumentException("Ya hay 5 vagones (máximo). ");
		}		
		//Que el vagón no esté ya en el tren
		//HACER ENM CASA
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
