
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
	
	public Pokemon(String nombre,String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public void atacar() {
		System.out.println("Ataco");
	}
	
	public void obtenerEstadisticas() {
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Vida: " + this.vida);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Tipo: " + this.tipo);

	}

}
