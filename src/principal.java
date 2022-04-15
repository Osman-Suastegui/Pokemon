import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apodo;
		Pokemon pokeElegido;
		System.out.println("Bienvenido al mejor juego de Pokemon");
		System.out.print("Ingrese su nombre: " );
		nombre = sc.nextLine();
	    Entrenador ent = new Entrenador(nombre);
		System.out.println("Que Pokemon desea obtener:" );
		Catalogo cat1 = new Catalogo();
		System.out.println(cat1.verPokemon());
		int opcion = sc.nextInt();
		System.out.print("Felicidades Obtuviste un ");
		if(opcion == 1) {
			System.out.println("Charizard");
		}else if(opcion == 2) {
			System.out.println("Blastoise");
		}else {
			System.out.println("Venusaur");
		}
		System.out.println("¿Que mote le deseas poner a tu Pokemon?");
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
			System.out.println("\n   MENU PRINCIPAL");
			System.out.println("¿Que desea hacer?");
			System.out.println("1: Abrir menu Catalogo");
			System.out.println("2: Abrir menu Pokedex");
			System.out.println("3: Caminar");
			System.out.println("4: Salir del juego");
			 opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				mostrarCatalogo();
				break;
			case 2:
				mostrarPokedex(ent);
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
		int resp = 1;
		while(opcion != 4) {

			System.out.println("\n  MENU CATALOGO");
			System.out.println("1: Buscar Pokemon por nombre");
			System.out.println("2: Buscar Pokemon por tipo");
			System.out.println("3: Ver todos los Pokemon disponibles en el juego");
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
			System.out.println("\n¿Desea volver a ver el Menu Catalogo?");
			System.out.println("0: No\n1: Si");
			resp = sc.nextInt();
			if(resp == 0) {
				return 0;
			}
			
		}


		sc.close();
		return 0;
		
		
	}
	
	public static int mostrarPokedex(Entrenador ent1) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int resp = 1;
		while(opcion != 4) {

			System.out.println("\n  MENU POKEDEX");
			System.out.println("1: Buscar tus Pokemon por nombre");
			System.out.println("2: Buscar tus Pokemon por tipo");
			System.out.println("3: Ver todos tus Pokemon");
			System.out.println("4: Volver al menu principal");
	
			opcion = sc.nextInt();
			switch(opcion) {
				case 1:
					System.out.print("Ingrese el nombre del pokemon: ");
					String nombre = sc.next();
					int posicion = ent1.miPokedex.existePokemon(nombre);
					if(posicion == -1) {
						System.out.println("El pokemon " + nombre + " no se encuentra");
					}else {
						System.out.println("Pokemon " + nombre +" Encontrado!");
						ent1.miPokedex.buscarPokemon(posicion).obtenerEstadisticas();
					}
					break;
				case 2:
					System.out.print("Ingrese el tipo del pokemon: ");
					String tipo = sc.next();
					if(tipo.equals("FUEGO") || tipo.equals("AGUA") & tipo.equals("PLANTA")) {
						Pokemon[] pok_tipo = ent1.miPokedex.buscarPokemonTipo(tipo);
						for(int i = 0; i < pok_tipo.length; i++) {
							if(pok_tipo[i] != null) {
								System.out.println("Pokemon de tipo " + tipo +" Encontrado!");
								pok_tipo[i].obtenerEstadisticas();	

							}
							
						}
						
					}else {
						System.out.println("El entrenador Pokemon " + ent1.obtenerNombre() + " no cuenta con Pokemon tipo: " + tipo );
					}
						
					break;
				case 3:
					System.out.println(ent1.miPokedex.verPokemon());
					break;
				case 4:
					return 0;
				default:
					System.out.println("Opcion invalida");
					break;
				
				}
			System.out.println("\n¿Desea volver a ver el Menu Pokedex?");
			System.out.println("0: No\n1: Si");
			resp = sc.nextInt();
			if(resp == 0) {
				return 0;
			}
		}
		sc.close();
		return 0;
	}

	public static void caminar() {
	
	}
	

}
