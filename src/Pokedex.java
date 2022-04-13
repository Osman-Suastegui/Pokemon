
public class Pokedex extends Catalogo {
    int totalPokemon = 0;
    int limite = 3 ;
    Pokemon [] misPokemon = new Pokemon[limite];

    @Override
    public int existePokemon(String nombre) {
		for(int i = 0 ; i < this.totalPokemon; i++) {
			if(misPokemon[i].nombre.equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
    
    @Override
    public Pokemon buscarPokemon(int i) {
		return misPokemon[i];
	}
    public void agregarPokemon(Pokemon pokemonCapturado){
        this.misPokemon[this.totalPokemon] = pokemonCapturado;
        this.totalPokemon++;

    }

}
