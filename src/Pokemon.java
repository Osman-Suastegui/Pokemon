
public class Pokemon {
	public String apodo = "SALVAJE";
	public String nombre;
	public int vida;
	public int vidaTotal;
	public int nivel = 1;
	public String tipo;
	public int ataque;
	public int defensa;
 	public String fuerteContra;
	public String debilContra;
	
	public Pokemon(String nombre) {
		this.nombre = nombre;
	}
	
	public void atacar(Pokemon pokeAtacante, Pokemon pokeDañado, Boolean miPokeAtaca) {
		
		//FORMULA DEL DAÑO
		int daño = ((pokeAtacante.ataque +10) * pokeAtacante.nivel) - (pokeDañado.defensa * pokeDañado.nivel);
		
		//CALCULO DEL DAÑO HECHO
			if(pokeAtacante.fuerteContra.equals(pokeDañado.tipo) ) {
				 daño *= 2;				
			   }
			
			if(pokeAtacante.debilContra.equals(pokeDañado.tipo)) {
				daño -= 5;
			   }
			
				pokeDañado.vida -= daño;
			
				String mInicio = miPokeAtaca ? pokeAtacante.apodo + " ataco al " + pokeDañado.nombre + " salvaje": "el " + pokeAtacante.nombre + " salvaje ataco a " + pokeDañado.apodo;
				String mFin = miPokeAtaca ? "La vida del " + pokeDañado.nombre + " bajo a " + pokeDañado.vida:"La vida de " + pokeDañado.apodo + " bajo a " + pokeDañado.vida;
			

				System.out.println(mInicio);
				
				if(pokeAtacante.fuerteContra.equals(pokeDañado.tipo)) {
					System.out.println("ES UN ATAQUE SUPER EFICAZ");
						}
					
				if(pokeAtacante.debilContra.equals(pokeDañado.tipo)) {
					System.out.println("NO ES UN ATAQUE MUY EFECTIVO");
						}
				
				if(pokeDañado.vida > 0 ) {
					System.out.println(mFin);
						}
				
				
					} // llave cierre del metodo
	
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
