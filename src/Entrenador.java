
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

	public Boolean caminar() {
		int probabilidad = (int) (Math.random() * 100) + 1;
		return probabilidad >= 50;
	}

	public Pokemon elegirPokemon(int posicion) {
		Pokemon pokElegido = this.miPokedex.buscarPokemon(posicion - 1);
		return pokElegido;
	}

	public void CurarPokemon(Pokemon miPokemon) {
		miPokemon.vida = miPokemon.vidaTotal;
	}

	public boolean atrapar() {
		int probabilidad = (int) (Math.random() * 100) + 1;
		return probabilidad >= 50;

	}
	
	

} 
