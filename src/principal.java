import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apodo;
		Pokemon pokeElegido;
		System.out.println("Bienvenido al mejor juego de Pokemon");
		System.out.print("Ingrese su nombre: " );
		nombre = sc.next();
		Entrenador ent = new Entrenador(nombre);
		System.out.print("Que Pokemon desea obtener:" );
		Catalogo cat1 = new Catalogo();
		System.out.print(cat1.verPokemon());
		int opcion = sc.nextInt();
		System.out.println("¿Que mote le deseas poner a tu pokemon");
		apodo = sc.next();
		if(opcion == 1) {
			pokeElegido = new Fuego("CHARIZARD", apodo);

		}else if(opcion == 2) {
			pokeElegido = new Agua("BLASTOISE", apodo);

		}else{
			pokeElegido = new Planta("VENUSAUR", apodo);
		}
		
		ent.miPokedex.agregarPokemon(pokeElegido);
		
		opcion = 0;
		while (opcion != 4) {
			System.out.println("ï¿½Que desea hacer?");
			System.out.println("1: Abrir menu catalogo");
			System.out.println("2: Abrir Pokedex");
			System.out.println("3: Caminar");
			System.out.println("4: Salir del juego");
			 opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				mostrarCatalogo();
				break;
			case 2:
				mostrarPokedex();
				break;
			case 3:
				ent.caminar();
				break;
			case 4:
				System.out.println("Saliendo del juego...");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		
		}
	}
	
	public static int mostrarCatalogo() {
		Scanner sc = new Scanner(System.in);
		Catalogo catalogo = new Catalogo();
		int opcion = 0;
		while(opcion != 4) {

			System.out.println("1: Buscar por nombre");
			System.out.println("2: Buscar por tipo");
			System.out.println("3: Ver todos los pokemones");
			System.out.println("4: Volver al menu principal");

			opcion = sc.nextInt();
			switch(opcion) {
				case 1:
					System.out.print("Ingrese el nombre del pokemon: ");
					String nombre = sc.next();
					int posicion = catalogo.existePokemon(nombre);
					if(posicion == -1) {
						System.out.println("El pokemon " + nombre + " no se encuentra");
					}else {
						catalogo.buscarPokemon(posicion).obtenerEstadisticas();
					}
					break;
				case 2:
					System.out.print("Ingrese el tipo del pokemon: ");
					String tipo = sc.next();
					Pokemon[] pok_tipo = catalogo.buscarPokemonTipo(tipo);

					for(int i = 0; i < pok_tipo.length; i++) {
						if(pok_tipo[i] != null) {
							pok_tipo[i].obtenerEstadisticas();	
						}
						
					}			
					break;
				case 3:
					System.out.println(catalogo.verPokemon());
					break;
				case 4:
					return 0;
				default:
					System.out.println("Opcion invalida");
					break;
				
				}
		}
		sc.close();
		return 0;
		
		
	}
	
	public static void mostrarPokedex() {
	
	}

	public static void caminar() {
	
	}
	

}
