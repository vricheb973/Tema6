package diapositiva28;

public class CuentaCorriente {
	
	String dni;
	String titular;
	double saldo;	
	
	public CuentaCorriente(String dni, String titular) {
		if(dni == null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI no es válido. Debe tener 9 caracteres. ");
		}
		if(titular == null || titular.isBlank()) {
			throw new IllegalArgumentException("El nombre del titular no puede ser nulo, vacío o en blanco. ");
		}
		
		this.dni = dni;
		this.titular = titular;
		this.saldo = 0.0;
	}
	
	public CuentaCorriente(String dni, String titular, double saldo) {
		if(dni == null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI no es válido. Debe tener 9 caracteres. ");
		}
		if(titular == null || titular.isBlank()) {
			throw new IllegalArgumentException("El nombre del titular no puede ser nulo, vacío o en blanco. ");
		}
		if(saldo < 0.0) {
			throw new IllegalArgumentException("El saldo no debe ser negativo. ");
		}
		
		this.dni = dni;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	void ingresar(double cantidad) {
		if(cantidad <= 0.0) {
			throw new IllegalArgumentException("La cantidad a ingresar debe ser positiva. ");
		}
		
		this.saldo += cantidad;
	}
	
	void retirar(double cantidad) {
		if(this.saldo < cantidad) {
			throw new IllegalArgumentException("No tienes suficiente saldo. ");
		}
		
		this.saldo -= cantidad;
	}
	
	void mostrarInformacion() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Titular: " + this.titular);
		System.out.printf("Saldo: %.2f € \n", this.saldo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
