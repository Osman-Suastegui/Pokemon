import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Bienvenido al mejor juego de Pokemon");
		System.out.print("Ingrese su nombre: " );
		nombre = sc.next();
		Entrenador e1 = new Entrenador(nombre);
		System.out.println("¿Que desea hacer?");
		System.out.println("1: Abrir menu catalogo");
		System.out.println("2: Abrir Pokedex");
		System.out.println("3: Caminar");
		System.out.println("0: Salir del juego");

	}
	
	public void mostrarCatalogo() {
		Scanner sc = new Scanner(System.in);
		Catalogo catalogo = new Catalogo();
		int opcion = 0;
		do{

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
				if(posicion != -1) {
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
					pok_tipo[i].obtenerEstadisticas();
				}			
				break;
			case 3:
				System.out.println(catalogo.verPokemon());
				break;
			case 4:
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			
			}
		}while(opcion != 4);
		sc.close();

		
	}
	
	

}
