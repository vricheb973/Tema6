package ejemplo1;

class Coche {
	
	private String matricula;
	private String combustible;
	private int kilometraje;
	
	public Coche(String matricula, String combustible, int kilometraje) {
		this.matricula = matricula;
		this.combustible = combustible;
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
	
	
	
	
	
	
	
	

}
