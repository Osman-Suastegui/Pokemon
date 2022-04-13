import java.util.Arrays;  
public class Catalogo {
	
	private int totalPokemones = 3;
	Pokemon[] pokemon = new Pokemon[totalPokemones];
	
	 public Catalogo() {
		 Pokemon pok1 = new Fuego("CHARIZARD");
		 Pokemon pok2 = new Agua("BLASTOISE");
		 Pokemon pok3 = new Fuego("VENUSAUR");
		
		pokemon[0] = pok1;
		pokemon[1] = pok2;
		pokemon[2] = pok3;
	
	}
	
	public int obtenerTotalPokemones() {
		return this.totalPokemones;
	}
	
	public int existePokemon(String nombre) {
		for(int i = 0 ; i < totalPokemones; i++) {
			if(pokemon[i].nombre.equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
	
	public Pokemon buscarPokemon(int i) {
		return pokemon[i];
	}
	
	
	
}
