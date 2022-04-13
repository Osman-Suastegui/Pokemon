
public class Pokemon {
	public String nombre;
	public int vida = 200;
	public int nivel = 1 ;
	public int experiencia = 0;
	public String tipo;
	
	public Pokemon(String nombre,String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public void atacar() {
		System.out.println("Ataco");
	}
	public void defender() {
		
		System.out.println("me defiendo");
	}
	public void obtenerEstadisticas() {
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Vida: " + this.vida);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Experiencia: " + this.experiencia);
		System.out.println("Tipo: " + this.tipo);

	}

}
