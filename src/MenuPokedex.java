import java.util.Scanner;

public class MenuPokedex {
	public static int mostrarPokedex(Entrenador ent1) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion != 4) {

			System.out.println("\n  MENU POKEDEX");
			System.out.println("1: Buscar tus Pokemon por mote");
			System.out.println("2: Buscar tus Pokemon por tipo");
			System.out.println("3: Ver todos tus Pokemon");
			System.out.println("4: Volver al menu principal");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
				case 1:
					System.out.print("Ingrese el apodo del pokemon: ");
					String apodo = sc.next();
					int posicion = ent1.miPokedex.existePokemon(apodo);
					if(posicion == -1) {
						System.out.println("El pokemon con mote " + apodo + " no se encuentra");
					}else {
						System.out.println("Pokemon con mote " + apodo +" Encontrado!");
						System.out.println(ent1.miPokedex.buscarPokemon(posicion).obtenerEstadisticas());
					}
					break;
					
				case 2:
					System.out.print("Ingrese el tipo del pokemon: ");
					String tipo = sc.next();
					if(tipo.equals("FUEGO") || tipo.equals("AGUA") || tipo.equals("PLANTA")) {
						Pokemon[] pok_tipo = ent1.miPokedex.buscarPokemonTipo(tipo);
						for(int i = 0; i < pok_tipo.length; i++) {
							if(pok_tipo[i] != null){
								System.out.println("Pokemon de tipo " + tipo +" Encontrado!");
								System.out.println(pok_tipo[i].obtenerEstadisticas());
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
	
		}
		sc.close();
		return 0;
	}
}
