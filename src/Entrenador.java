import javax.xml.catalog.Catalog;

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

	
	private Boolean seEncontroUnPokemon(){
		int probabilidad =  (int) (Math.random() * 100) + 1;
		if (probabilidad >= 50) {
			return true;
		}
		return false;
	}

	public void caminar() {
		if (seEncontroUnPokemon()) {
			Catalogo catalogo = new Catalogo();
			int posicion = (int) (Math.random() * catalogo.obtenerTotalPokemones()) + 1;			
			Pokemon pokemonAleatorio = catalogo.pokemon[posicion - 1];
			// te toca pelear contra
			System.out.println("Te haz encontra con un " + pokemonAleatorio.nombre + " salvaje"); 
			Pokemon pokElegido = elegirPokemon();
			pelear(pokElegido, pokemonAleatorio);
		}
	}
	private Pokemon elegirPokemon(){
		
		System.out.println("Ingrese el pokemon para pelear: ");
		System.out.println(this.miPokedex.verPokemon());
		int posicion = Integer.parseInt(System.console().readLine());
		Pokemon pokElegido =  this.miPokedex.buscarPokemon(posicion - 1);
		return pokElegido;

	}
	//Pelear contra Pokemon
	private void pelear(Pokemon miPokemon, Pokemon pokemonSalvaje){
		

	}
}
