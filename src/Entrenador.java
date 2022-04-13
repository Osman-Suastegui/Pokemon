
public class Entrenador {
	private String nombre;
	public Pokedex miPokedex;
	
	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.miPokedex = new Pokedex();
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}

	

	public void caminar() {
		
	}
}
