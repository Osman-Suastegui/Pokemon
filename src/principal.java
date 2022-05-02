import java.util.Scanner;

public class principal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre = "";

		System.out.println("Bienvenido al mejor juego de Pokemon");
		System.out.print("Ingrese su nombre: ");
		nombre = sc.nextLine();

		Entrenador ent = new Entrenador(nombre);
		elegirPokemon(ent);

		int opcion = 0;
		while (opcion != 4) {
			System.out.println("\n   MENU PRINCIPAL");
			System.out.println("�Que desea hacer?");
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
					caminar(ent);
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

	public static void caminar(Entrenador ent) {
		System.out.print("Pulse una tecla para dar 1 paso: ");
		sc.next();
		if (ent.caminar()) { // si se encuentra un pokemon caminando retorna true
			Catalogo cat = new Catalogo();
			int posicion = (int) (Math.random() * cat.obtenerTotalPokemones()) + 1;
			Pokemon pokemonSalvaje = cat.pokemon[posicion - 1];

			System.out.println("Te haz encontra con un " + pokemonSalvaje.nombre + " salvaje");
			System.out.println("Ingrese el pokemon para pelear: ");
			System.out.println(ent.miPokedex.verPokemon());
			int posicion2 = sc.nextInt();

			Pokemon pokelegido = ent.elegirPokemon(posicion2);

			Pelea pelea = new Pelea();
			int resMoneda = 0;

			while (pelea.obtenerGanador() == 0) {
				System.out.println("Presiona una tecla para lanzar una moneda");
				sc.next();
				resMoneda = pelea.lanzarMoneda();
				if (resMoneda == 1) {
					System.out.println("Tu pokemon atacara");
					if (pokelegido.fuerteContra.equals(pokemonSalvaje.tipo)) {
						System.out.println("ES UN ATAQUE SUPER EFICAZ");
					}
					if (pokelegido.debilContra.equals(pokemonSalvaje.tipo)) {
						System.out.println("NO ES UN ATAQUE MUY EFECTIVO");
					}
					pelea.pelear(pokelegido, pokemonSalvaje, resMoneda);
					System.out.println(pokelegido.apodo +" ha causado " + pelea.obtenerDanoHecho() + " de dano");
					System.out.println("El "+ pokemonSalvaje.nombre + " salvaje tiene " + pokemonSalvaje.vida + " de vida");
					continue;
				}

				System.out.println("El pokemon salvaje te atacara");
				if (pokemonSalvaje.fuerteContra.equals(pokelegido.tipo)) {
					System.out.println("ES UN ATAQUE SUPER EFICAZ");
				}
				if (pokemonSalvaje.debilContra.equals(pokelegido.tipo)) {
					System.out.println("NO ES UN ATAQUE MUY EFECTIVO");
				}
				pelea.pelear(pokelegido, pokemonSalvaje, resMoneda);
				System.out.println("El " + pokemonSalvaje.nombre + " salvaje te ha causado " + pelea.obtenerDanoHecho() + " de dano");
				System.out.println(pokelegido.apodo + "  tiene " + pokelegido.vida + " de vida");

			}
			// YA HAY UN GANADOR
			if (pelea.obtenerGanador() == 2) {
				System.out.println("Te han derrotado");
				ent.CurarPokemon(pokelegido);
			} else {
				System.out.println("Haz derrotado al Pokemon salvaje " + pokemonSalvaje.nombre);
				pokelegido.subirNivel();
				System.out.println(pokelegido.apodo + " ha subido a nivel " + pokelegido.nivel);

				if (ent.miPokedex.estaLlena() == false) {
					System.out.println("�Deseas capturar al pokemon salvaje " + pokemonSalvaje.nombre);
					System.out.println("1: Si");
					System.out.println("2: No");
					int resp = sc.nextInt();
					if (resp == 1)
						intentarAtrapar(ent, pokemonSalvaje);

				}
			}

		} else {
			System.out.println("No ha pasado nada...");
		}

	}

	public static void intentarAtrapar(Entrenador ent, Pokemon pokemonAtrapar) {
		int intentos = 0;
		while (intentos < 3) {
			System.out.println("Intento numero: " + intentos);
			System.out.print("Digite un 1 para lanzar una Pokebola: ");
			sc.next();
			if (ent.atrapar()) {
				System.out.println("Felicidades haz atrapado un " + pokemonAtrapar.nombre);
				System.out.println("�Que mote deseas darle a tu nuevo " + pokemonAtrapar.nombre + "?: ");
				pokemonAtrapar.apodo = sc.next();
				ent.CurarPokemon(pokemonAtrapar);
				ent.miPokedex.agregarPokemon(pokemonAtrapar);
				break;
			}
			System.out.println("El " + pokemonAtrapar.nombre + " se ha escapado de la Pokebola");
			intentos++;
		}
		if (intentos >= 3)
			System.out.println("Intentos terminados, el " + pokemonAtrapar.nombre + " ha huido");

	}

	public static void elegirPokemon(Entrenador ent) {

		String apodo;
		Catalogo cat1 = new Catalogo();

		System.out.println("Que Pokemon desea obtener:");
		System.out.println(cat1.verPokemon());
		int opcion = sc.nextInt();

		System.out.print("Felicidades Obtuviste un ");
		String nomPokemon = cat1.pokemon[opcion - 1].nombre;
		String tipoPokemon = cat1.pokemon[opcion - 1].tipo;
		System.out.println(nomPokemon);

		System.out.println("�Que mote le deseas poner a tu Pokemon?");
		apodo = sc.next();

		Pokemon pokeElegido;

		if (tipoPokemon == "FUEGO") {
			pokeElegido = new Fuego(nomPokemon, apodo);
		} else if (tipoPokemon == "AGUA") {
			pokeElegido = new Agua(nomPokemon, apodo);
		} else { // tipoPokemon == "PLANTA"
			pokeElegido = new Planta(nomPokemon, apodo);
		}

		ent.miPokedex.agregarPokemon(pokeElegido);
	}

}
