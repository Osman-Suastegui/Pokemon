import java.util.HashMap;
import java.util.Arrays;  
public class Catalogo {
	
	private int totalPokemones = PokemonesDisponibles.values().length; 
	Pokemon[] pokemon = new Pokemon[totalPokemones];
	
	 public Catalogo() {
		// Pokemon pok1 = new Fuego("CHARIZARD","FUEGO");
		// Pokemon pok2 = new Fuego("TORTUGA","FUEGO");
		// Pokemon pok3 = new Fuego("ELPLANTA","FUEGO");
		
		// pokemon[0] = pok1;
		// pokemon[1] = pok2;
		// pokemon[2] = pok3;
	
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
