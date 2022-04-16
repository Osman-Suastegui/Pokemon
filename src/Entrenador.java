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

	
	public Boolean generarProbabilidad(){
		int probabilidad =  (int) (Math.random() * 100) + 1;	
		return probabilidad >= 50 ? true:false;
		}

	
	public Boolean caminar() {		
	
			return generarProbabilidad();
		}
		

	
	public Pokemon elegirPokemon(int posicion){
		Pokemon pokElegido =  this.miPokedex.buscarPokemon(posicion - 1);
		return pokElegido;
		}

	public void pelear(Pokemon miPokemon, Pokemon pokemonSalvaje){
				Scanner sc = new Scanner(System.in);
			while(miPokemon.vida > 0 && pokemonSalvaje.vida > 0) {
				System.out.println("Escoja un numero entre el 1 y el 100 para determinar que Pokemon atacara:");
				sc.next();
			if(generarProbabilidad()) {
				System.out.println("Tu Pokemon atacara!!");
				miPokemon.atacar(miPokemon, pokemonSalvaje, true);
			}else {
				System.out.println("El Pokemon salvaje atacara!!");
				pokemonSalvaje.atacar(pokemonSalvaje, miPokemon, false);
				  } 
																  } // llave while
			if(miPokemon.vida <= 0 ) {
				System.out.println("Te han derrotado");
			if(miPokemon.nombre == "CHARIZARD") {
				miPokemon.vida = 70;
			}else{
				miPokemon.vida = 80;
			}
			}else{
				System.out.println("Haz derrotado al Pokemon salvaje " + pokemonSalvaje.nombre);
				miPokemon.nivel = miPokemon.nivel + 1;
				System.out.println(miPokemon.apodo + " ha subido a nivel " + miPokemon.nivel);
			if(miPokemon.nombre == "CHARIZARD") {
				miPokemon.vida = 70;
			}else{
				miPokemon.vida = 80;
				 }
			if(this.miPokedex.totalPokemon < 3) {	
				System.out.println("¿Deseas capturar al pokemon salvaje " + pokemonSalvaje.nombre +  " ? 1: Si - 2: No");
				int resp = sc.nextInt();
			if(resp == 1) {
				Atrapar(pokemonSalvaje);	
						  }
					}
				 }
																	} // fin llave metodo pelear
	
	private void Atrapar(Pokemon pokemonAtrapar) {
			Scanner sc = new Scanner(System.in);
		
			int intentos = 1;
		while(intentos <= 3) {
			System.out.println("Intento numero: " + intentos);	
			System.out.print("Digite un 1 para lanzar una Pokebola: ");
			sc.next();
			
		if(generarProbabilidad()) {
			System.out.println("Felicidades haz atrapado un " + pokemonAtrapar.nombre);
			System.out.println("¿Que mote deseas darle a tu nuevo " + pokemonAtrapar.nombre + "?: ");
			pokemonAtrapar.apodo = sc.next();
		if(pokemonAtrapar.nombre == "CHARIZARD") {
			pokemonAtrapar.vida = 70;
		}else{
			pokemonAtrapar.vida = 80;
			 }
			this.miPokedex.agregarPokemon(pokemonAtrapar);
		break;
		
		}else{
			System.out.println("El " + pokemonAtrapar.nombre + " se ha escapado de la Pokebola");
			intentos = intentos + 1;
		if(intentos>3) {
			System.out.println("Intentos terminados, el " + pokemonAtrapar.nombre + " ha huido");
					   }
				}
			}
		
		} // fin llave metodo atrapar
	

	
	} // fin llave clase entrenador












