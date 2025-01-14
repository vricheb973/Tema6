package diapositiva46;

public class CuentaCorriente {
	
	//Atributos
	private String dni;
	private String titular;
	private double saldo;	
	
	//Atributos estáticos
	private static String nombreBanco;
	
	//Constructores
	public CuentaCorriente(String dni, String titular) {
		setDni(dni);
		setTitular(titular);
		this.saldo = 0.0;
	}
	
	public CuentaCorriente(String dni, String titular, double saldo) {
		setDni(dni);
		setTitular(titular);
		setSaldo(saldo);
	}
	
	//Getters y setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(dni == null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI no es válido. Debe tener 9 caracteres. ");
		}
		this.dni = dni;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(titular == null || titular.isBlank()) {
			throw new IllegalArgumentException("El nombre del titular no puede ser nulo, vacío o en blanco. ");
		}
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo < 0.0) {
			throw new IllegalArgumentException("El saldo no debe ser negativo. ");
		}
		this.saldo = saldo;
	}
	
	//Getters y setters estáticos
	public static String getNombreBanco() {
		return CuentaCorriente.nombreBanco;
	}
	
	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}

	//Métodos
	public void ingresar(double cantidad) {
		if(cantidad <= 0.0) {
			throw new IllegalArgumentException("La cantidad a ingresar debe ser positiva. ");
		}
		
		this.saldo += cantidad;
	}
	
	public void retirar(double cantidad) {
		if(this.saldo < cantidad) {
			throw new IllegalArgumentException("No tienes suficiente saldo. ");
		}
		
		this.saldo -= cantidad;
	}
	
	public void mostrarInformacion() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Titular: " + this.titular);
		System.out.printf("Saldo: %.2f € \n", this.saldo);
		System.out.println("Banco: " + CuentaCorriente.nombreBanco);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
