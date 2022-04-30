 public class Catalogo {
	
	private int totalPokemones = 3;
	Pokemon[] pokemon = new Pokemon[totalPokemones];
	
	 public Catalogo() {
		 Pokemon pok1 = new Fuego("CHARIZARD");
		 Pokemon pok2 = new Agua("BLASTOISE");
		 Pokemon pok3 = new Planta("VENUSAUR");
		
		pokemon[0] = pok1;
		pokemon[1] = pok2;
		pokemon[2] = pok3;
	
	}
	
	 //Mostrar el total de pokemon existentes en el juego
	public int obtenerTotalPokemones() {
		return this.totalPokemones;
	}
		
	 //Ver si existe el pokemon buscandolo por nombre
	public int existePokemon(String nombre) {
		for(int i = 0 ; i < totalPokemones; i++) {
			if(pokemon[i].nombre.equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
	
	public Pokemon[] buscarPokemonTipo(String tipo) {
		Pokemon[] pokemon_tipo = new Pokemon[totalPokemones];
		int contador = 0;
		for(int i = 0; i < totalPokemones; i++) {
			if(pokemon[i].tipo.equals(tipo)) {
				pokemon_tipo[contador] = pokemon[i];
				contador++;
			}
		}
		return pokemon_tipo;
	}
	
    //Si el pokemon existe, lo mostrara
	public Pokemon buscarPokemon(int i) {
		return pokemon[i];
	}
	
    // ver todos los pokemon existentes en el juego (solo el nombre)
	public String verPokemon() {
		String str;
		str = "1: " + pokemon[0].nombre + "\n2: " + pokemon[1].nombre + "\n3: " + pokemon[2].nombre;
		return str;
		
	}
	
	
	
	
}
