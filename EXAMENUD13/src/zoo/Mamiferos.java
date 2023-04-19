package zoo;

public class Mamiferos extends Animales {

	private String desplazamiento;
	
	public Mamiferos(String nombre, char genero, String especie, int edad, Habitat habitat, EmpleadoZoo cuidador,String desplazamiento) {
		super(nombre, genero, especie, edad, habitat, cuidador);
		this.desplazamiento = desplazamiento;
	}

}
