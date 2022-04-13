
public class Entrenador {
	private String nombre;
	private Pokedex miPokedex;
	
	public Entrenador(String nombre,Pokedex miPokedex) {
		this.nombre = nombre;
		this.miPokedex = miPokedex;
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}
	

	public void caminar() {
		
	}
}
