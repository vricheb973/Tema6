package diapositiva62;

public class Bombilla {
	
	private boolean estado;
	
	private static boolean interruptorGeneral = false;
	
	public Bombilla() {
		this.estado = false;
	}
	
	public void verEstado() {
		if(estado && interruptorGeneral) {
			System.out.println("Encendida");
		}
		else {
			System.out.println("Apagada");
		}
	}
	
	public void interruptor() {
		if(this.estado) {
			this.estado = false;
		}
		else {
			this.estado = true;
		}
	}
	
	public static void interruptorGeneral() {
		if(Bombilla.interruptorGeneral) {
			Bombilla.interruptorGeneral = false;
		}
		else {
			Bombilla.interruptorGeneral = true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
