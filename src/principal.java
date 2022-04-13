import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Bienvenido al mejor juego de Pokémon");
		System.out.print("Ingrese su nombre: " );
		nombre = sc.next();
		Entrenador e1 = new Entrenador(nombre);
		System.out.println("¿Que desea hacer?");
		System.out.println("1: Abrir menu catalogo");
		System.out.println("2: Abrir Pokédex");
		System.out.println("3: Caminar");
		System.out.println("0: Salir del juego");

	}
	
	public void mostrarCatalogo() {
		
	}
	
	

}
