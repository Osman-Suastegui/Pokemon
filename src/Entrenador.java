import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el pokemon para pelear: ");
		System.out.println(this.miPokedex.verPokemon());
		int posicion = sc.nextInt();
		Pokemon pokElegido =  this.miPokedex.buscarPokemon(posicion - 1);
		return pokElegido;

	}
	//Pelear contra Pokemon
	private void pelear(Pokemon miPokemon, Pokemon pokemonSalvaje){
		Scanner sc = new Scanner(System.in);
		while(miPokemon.vida > 0 && pokemonSalvaje.vida > 0) {
			System.out.println("Escoja un numero entre el 1 y el 100:");
			sc.next();
			if(seEncontroUnPokemon()) {
				miPokemon.atacar(miPokemon, pokemonSalvaje, true);
			}else {
				pokemonSalvaje.atacar(pokemonSalvaje, miPokemon, false);
		}
}
		if(miPokemon.vida <= 0 ) {
			System.out.println("Te han derrotado");
		}else{
			System.out.println("Haz derrotado al Pokemon " + pokemonSalvaje.nombre);
			miPokemon.nivel = miPokemon.nivel + 1;
			System.out.println("¿Deseas capturarlo? 1: Si - 2: No");
			int resp = sc.nextInt();
			if(resp == 1) {
			Atrapar(pokemonSalvaje);	
			}
		}
	}
	
	private void Atrapar(Pokemon pokemonAtrapar) {
		Scanner sc = new Scanner(System.in);
		int intentos = 3;
		while(intentos > 0) {
		System.out.print("Digite un 1 para lanzar una Pokebola: ");
		sc.next();
		
		if(seEncontroUnPokemon()) {
			
			
			System.out.println("Felicidades haz atrapado un " + pokemonAtrapar.nombre);
			System.out.println("¿Que mote deseas darle a tu nuevo " + pokemonAtrapar.nombre + "?: ");
			pokemonAtrapar.apodo = sc.next();
			this.miPokedex.agregarPokemon(pokemonAtrapar);
			break;
		}else {
			intentos = intentos - 1;		
		}
			}
	}
	
	
	
}












