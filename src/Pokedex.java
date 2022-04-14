
public class Pokedex extends Catalogo {
    int totalPokemon = 0;
    int limite = 3 ;
    Pokemon [] misPokemon = new Pokemon[limite];

    //Ver si existe el pokemon buscandolo por nombre
    @Override
    public int existePokemon(String nombre) {
		for(int i = 0 ; i < this.totalPokemon; i++) {
			if(misPokemon[i].nombre.equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
    
  //Ver si existe el pokemon buscandolo por tipo
    @Override
	public int existeTipo(String tipo) {
		for(int i = 0 ; i <this.totalPokemon; i++) {
			if(misPokemon[i].tipo.equals(tipo)) {
				return i;
			}
		}
		return -1;
	}
    
    
  //Si el pokemon existe, lo mostrara
    @Override
    public Pokemon buscarPokemon(int i) {
		return misPokemon[i];
	}
    
   //Registar al pokemon y añadirlo con su entrenador
    public void agregarPokemon(Pokemon pokemonCapturado){
        this.misPokemon[this.totalPokemon] = pokemonCapturado;
        this.totalPokemon++;

    }
    
  
    // ver todos los pokemon registrados (solo el nombre)
    @Override    
	public String verPokemon() {
		String str = "";
		for(int i = 0 ; i < totalPokemon; i++) {
				str = str + (i+1) + ": " + misPokemon[i].nombre + "\n";
		}
	return str;	
	}
    
   
    

}






