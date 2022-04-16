import java.util.Scanner;

public class principal {
  static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nombre = "";
		
		System.out.println("Bienvenido al mejor juego de Pokemon");
		System.out.print("Ingrese su nombre: " );
		nombre = sc.nextLine();
		
	    Entrenador ent = new Entrenador(nombre);
		elegirPokemon(ent);
		
		int opcion = 0;
		while (opcion != 4) {
			System.out.println("\n   MENU PRINCIPAL");
			System.out.println("ï¿½Que desea hacer?");
			System.out.println("1: Abrir menu Catalogo");
			System.out.println("2: Abrir menu Pokedex");
			System.out.println("3: Caminar");
			System.out.println("4: Salir del juego");
			 opcion = sc.nextInt();
			 
		switch (opcion) {
			case 1:
				MenuCatalogo.mostrarCatalogo();
				break;
				
			case 2:
				MenuPokedex.mostrarPokedex(ent);
				break;
				
			case 3:
				System.out.print("Pulse una tecla para dar 1 paso: ");
				sc.next();
				if(ent.caminar()) { //si se encuentra un pokemon caminando retorna true
					Catalogo cat = new Catalogo();
					int posicion = (int) (Math.random() * cat.obtenerTotalPokemones()) + 1;	
					Pokemon pokemonAleatorio = cat.pokemon[posicion - 1];
					
					System.out.println("Te haz encontra con un " + pokemonAleatorio.nombre + " salvaje"); 
					System.out.println("Ingrese el pokemon para pelear: ");
					System.out.println(ent.miPokedex.verPokemon());
					int posicion2 = sc.nextInt();
					Pokemon pokElegido = ent.elegirPokemon(posicion2);
					ent.pelear(pokElegido, pokemonAleatorio);
				}else {
					System.out.println("No ha pasado nada...");
				}
				
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
	
	public static void elegirPokemon(Entrenador ent){

		Pokemon pokeElegido;
		String apodo;
		Catalogo cat1 = new Catalogo();
		
		System.out.println("Que Pokemon desea obtener:" );
		System.out.println(cat1.verPokemon());
		int opcion = sc.nextInt();
		
		System.out.print("Felicidades Obtuviste un ");
		System.out.println(cat1.pokemon[opcion-1].nombre);
		
		System.out.println("¿Que mote le deseas poner a tu Pokemon?");
		apodo = sc.next();
		
		pokeElegido = cat1.pokemon[opcion];
		pokeElegido.apodo = apodo;
		
		
		ent.miPokedex.agregarPokemon(pokeElegido);
	}
	



	

}
