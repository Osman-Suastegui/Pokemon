
public class Pokemon {
	public String apodo;
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
	
	public void atacar() {
		System.out.println("Ataco");
	}
	
	public void obtenerEstadisticas() {
		System.out.println("Mote: " + this.apodo);
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
