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
//		for(int i=0; i<this.vagones.size(); i++) {
//			//Vagon vag = this.vagones.get(i);			
//			if(v.getNumero() == this.vagones.get(i).getNumero()) {
//				throw new IllegalArgumentException("El vagón ya está en el tren. ");
//			}
//		}
		for(Vagon vag : this.vagones) {
			if(v.getNumero() == vag.getNumero()) {
				throw new IllegalArgumentException("El vagón ya está en el tren. ");
			}
		}
		this.vagones.add(v);		
	}
	
	public void removeVagon(int i) {
		if(i<0 || i>= this.vagones.size()) {
			throw new IllegalArgumentException("No hay vagón en la posición indicada. ");
		}
		this.vagones.remove(i);
	}
	
	public void removeVagon(Vagon v) {
		if(v == null) {
			throw new IllegalArgumentException("El vagón no puede ser null. ");
		}
		boolean esta = false;
		//Que el vagon esté en la lista
		for(Vagon vag : this.vagones) {
			if(vag.getNumero() == v.getNumero()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("El vagón no está en la lista. ");
		}
		this.vagones.remove(v);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
