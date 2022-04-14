import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Bienvenido al mejor juego de Pokemon");
		System.out.print("Ingrese su nombre: " );
		nombre = sc.next();
		Entrenador ent = new Entrenador(nombre);
		System.out.println("¿Que desea hacer?");
		System.out.println("1: Abrir menu catalogo");
		System.out.println("2: Abrir Pokedex");
		System.out.println("3: Caminar");
		System.out.println("4: Salir del juego");
		int opcion = sc.nextInt();

		while (opcion != 4) {
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
	
	public static void mostrarCatalogo() {
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
				opcion = 4;
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			
			}
		}
		sc.close();
		
		
	}
	
	public static void mostrarPokedex() {
	
	}

	public static void caminar() {
	
	}
	

}
