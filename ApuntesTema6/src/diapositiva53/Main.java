package diapositiva53;

public class Main {

	public static void main(String[] args) {
		
		RadioFM radio1 = new RadioFM();
		RadioFM radio2 = new RadioFM(108);
		
		radio1.display();
		radio2.display();
		
		radio1.down();
		radio2.up();
		
		radio1.display();
		radio2.display();

	}

}
