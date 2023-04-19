package zoo;

public class Aves extends Animales {

	private int longitudPico;
	private boolean rapaz;
	
	public Aves(String nombre, char genero, String especie, int edad, Habitat habitat, 
			EmpleadoZoo cuidador, int longitudPico, boolean rapaz) {
		super(nombre, genero, especie, edad, habitat, cuidador);
		this.longitudPico = longitudPico;
		this.rapaz = rapaz;
		
	}
}
