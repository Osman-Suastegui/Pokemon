
public class Pokedex extends Catalogo {
    private int totalPokemon = 0;
    private int limite = 3 ;
    private Pokemon [] misPokemon = new Pokemon[limite];

    //Ver si existe el pokemon buscandolo por nombre
    @Override
    public int existePokemon(String apodo) {
		for(int i = 0 ; i < this.totalPokemon; i++) {
			if(this.misPokemon[i].apodo.equals(apodo)) {
				return i;
			}
		}
		return -1;
	}
    
    //Buscar pokemon por tipo y regresar todos los pokemon encontrados
    @Override
	public Pokemon[] buscarPokemonTipo(String tipo) {
		Pokemon[] pokemon_tipo = new Pokemon[this.totalPokemon];
		int contador = 0;
		for(int i = 0; i < this.totalPokemon; i++) {
			if(misPokemon[i].tipo.equals(tipo)) {
				pokemon_tipo[contador] = this.misPokemon[i];
				contador++;
			}
		}
		return pokemon_tipo;
	}
 
    
    
  //Si el pokemon existe, lo mostrara
    @Override
    public Pokemon buscarPokemon(int i) {
		return this.misPokemon[i];
	}
    
   //Registar al pokemon y anadirlo con su entrenador
    public void agregarPokemon(Pokemon pokemonCapturado){
        this.misPokemon[this.totalPokemon] = pokemonCapturado;
        this.totalPokemon++;

    }
    
  
    // ver todos los pokemon registrados (solo el nombre)
    @Override    
	public String verPokemon() {
		String str = "";
		for(int i = 0 ; i < this.totalPokemon; i++) {
				str = str + (i+1) + ": " + this.misPokemon[i].nombre + "-" + this.misPokemon[i].apodo + "\n";
		}
	return str;	
	}
	public boolean estaLlena() {
		return this.totalPokemon == this.limite ;
	}    
   
    

}






