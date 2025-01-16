package enumerados;

public class Coche {
	
	private String matricula;
	private TipoCombustible combustible;
	private int kilometraje;
	
	public Coche(String matricula, String combustible, int kilometraje) {
		setMatricula(matricula);
		setCombustible(combustible);
		this.kilometraje = kilometraje;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		if(matricula == null || matricula.length() != 7) {
			throw new IllegalArgumentException("La matrícula tiene que tener 7 caracteres. ");
		}
		this.matricula = matricula;
	}
	
	public String getCombustible() {
		return this.combustible.toString();
	}
	
	public void setCombustible(String combustible) {
		this.combustible = TipoCombustible.valueOf(combustible);
	}
	
	
	
	
	
	
	
	

}
