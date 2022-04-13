import java.util.Scanner;

public class principal {
	public static void irCatalogo(Entrenador ent) {
		
		int opc ;
		
		System.out.println("Elige una opcion: ");
		System.out.println("1.Buscar por nombre:");
		System.out.println("2.Buscar por tipo: ");
		Scanner sc = new Scanner(System.in);
		opc = sc.nextInt();
		Catalogo catalogo = new Catalogo();

		if (opc == 1) {
			System.out.print("Ingresa el nombre: ");
			String nombrePokemon = sc.next();
			int idx = catalogo.existePokemon(nombrePokemon); 
			if ( idx != -1) {
				catalogo.buscarPokemon(idx).obtenerEstadisticas();
			}else {
				System.out.println("No se encuentra el pokemon " + nombrePokemon);
			}
			
		}else {
			System.out.print("Ingresa el tipo: ");
//			ent.buscarPorNombre(sc.next());
			
		}
	}
	
	public static void irPokedex() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido");
		
		System.out.println("Elige tu nombre: ");
		String nombre = sc.next();
		
		Pokedex mipokedex = new Pokedex();
		
		Entrenador ent = new Entrenador(nombre,mipokedex);
		
		boolean continuar = true;
		while(continuar){
			System.out.println("Elige una opcion: ");
			System.out.println("1.Ver Catalogo: ");
			System.out.println("2.Ver pokedex: ");
			System.out.println("3.Caminar: ");
			int opc = sc.nextInt();
			
			  switch (opc) 
		        {
		            case 1:  
		            		irCatalogo(ent);
		                     break;
		            case 2: 
		            		irPokedex();
		                     break;
		            case 3:  
		            		ent.caminar();
		                     break;
		            default: 
		            	System.out.println("Respuesta invalida");
                    break;
		        }
			System.out.println("Desea continuar? 1.Si 2.No ");
			continuar = sc.nextInt() == 1 ? true : false; 
			
		}
		

	}
	
	

}
