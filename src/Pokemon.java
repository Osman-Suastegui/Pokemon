
public class Pokemon {
	public String apodo = "SALVAJE";
	public String nombre;
	public int vida;
	public int nivel = 1;
	public String tipo;
	public int ataque;
	public int defensa;
 	public String fuerteContra;
	public String debilContra;
	
	public Pokemon(String nombre) {
		this.nombre = nombre;
	}
	
	public void atacar(Pokemon pokeAtacante, Pokemon pokeDañado, Boolean flag) {
		int daño = pokeAtacante.ataque;
		pokeDañado.vida = pokeDañado.vida - daño;
		if(flag == true) {
			System.out.println(pokeAtacante.apodo + " ataco al " + pokeDañado.nombre + " salvaje");
			System.out.println("La vida del " + pokeDañado.nombre + " salvaje bajo a " + pokeDañado.vida);
		}else {
			System.out.println("el " + pokeAtacante.nombre + " salvaje ataco a " + pokeDañado.apodo);
			System.out.println("La vida de " + pokeDañado.apodo + " bajo a " + pokeDañado.vida);
		}
		
		


	}
	
	public void obtenerEstadisticas() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Vida: " + this.vida);
		System.out.println("Ataque: " + this.ataque);
		System.out.println("Defensa: " + this.defensa);
		System.out.println("Fortalezas: " + this.fuerteContra);
		System.out.println("Debilidades: " + this.debilContra);

	}

}
