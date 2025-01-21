package diapositiva62;

public class Main {

	public static void main(String[] args) {

		//Creamos 4 bombillas
		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla();
		Bombilla b3 = new Bombilla();
		Bombilla b4 = new Bombilla();
		
		//Activo el interruptor general
		Bombilla.interruptorGeneral();
		
		//Enciendo las bombillas 1 y 4
		b1.interruptor();
		b4.interruptor();

		//Veo el estado de todas, solo están encendidas la 1 y la 4
		b1.verEstado();
		b2.verEstado();
		b3.verEstado();
		b4.verEstado();
		
		//Bajo el interruptor general
		Bombilla.interruptorGeneral();
		
		//Veo el estado de todas (todas apagadas)
		b1.verEstado();
		b2.verEstado();
		b3.verEstado();
		b4.verEstado();
		
		//Subo el interruptor general
		Bombilla.interruptorGeneral();
		
		//Veo el estado de todas, solo están encendidas la 1 y la 4
		b1.verEstado();
		b2.verEstado();
		b3.verEstado();
		b4.verEstado();
	}

}
