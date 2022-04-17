import java.util.Scanner;

public class MenuCatalogo {
	public static int mostrarCatalogo() {
		Scanner sc = new Scanner(System.in);
		
		Catalogo catalogo = new Catalogo();
		int opcion = 0;
		
		while(opcion != 4) {
			
			System.out.println("\n  MENU CATALOGO");
			System.out.println("1: Buscar Pokemon por nombre");
			System.out.println("2: Buscar Pokemon por tipo");
			System.out.println("3: Ver todos los Pokemon disponibles en el juego");
			System.out.println("4: Volver al menu principal");
			opcion = sc.nextInt();
			
		switch(opcion) {
		
				case 1:
					System.out.println("Ingrese el nombre del pokemon: ");
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
}
