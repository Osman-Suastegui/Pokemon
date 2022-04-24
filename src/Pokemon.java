
public class Pokemon {
	protected String apodo = "SALVAJE";
	protected String nombre;
	protected int vida;
	protected int vidaTotal;
	protected int nivel = 1;
	protected String tipo;
	protected int ataque;
	protected int defensa;
	protected String fuerteContra;
	protected String debilContra;
	
	protected Pokemon(String nombre,int vida, int vidaTotal, String tipo, int ataque,int defensa, String fuerteContra, String debilContra ) {
		this.nombre = nombre;
		this.vida = vida;
		this.vidaTotal = vidaTotal;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.fuerteContra = fuerteContra;
		this.debilContra = debilContra;
	}
	
	protected void atacar(Pokemon pokeAtacante, Pokemon pokeDanado, Boolean miPokeAtaca) {
		
		//FORMULA DEL dano
		int dano = ((pokeAtacante.ataque +10) * pokeAtacante.nivel) - (pokeDanado.defensa * pokeDanado.nivel);
		
		//CALCULO DEL dano HECHO
			if(pokeAtacante.fuerteContra.equals(pokeDanado.tipo) ) {
				 dano *= 2;				
			   }
			
			if(pokeAtacante.debilContra.equals(pokeDanado.tipo)) {
				dano -= 5;
			   }
			
				pokeDanado.vida -= dano;
			
				String mInicio = miPokeAtaca ? pokeAtacante.apodo + " ataco al " + pokeDanado.nombre + " salvaje": "el " + pokeAtacante.nombre + " salvaje ataco a " + pokeDanado.apodo;
				String mFin = miPokeAtaca ? "La vida del " + pokeDanado.nombre + " bajo a " + pokeDanado.vida:"La vida de " + pokeDanado.apodo + " bajo a " + pokeDanado.vida;
			

				System.out.println(mInicio);
				
				if(pokeAtacante.fuerteContra.equals(pokeDanado.tipo)) {
					System.out.println("ES UN ATAQUE SUPER EFICAZ");
						}
					
				if(pokeAtacante.debilContra.equals(pokeDanado.tipo)) {
					System.out.println("NO ES UN ATAQUE MUY EFECTIVO");
						}
				
				if(pokeDanado.vida > 0 ) {
					System.out.println(mFin);
						}
				
				
					} // llave cierre del metodo
	
	protected String obtenerEstadisticas() {
		String str = "";
		str += "Nombre: " + nombre + "\n";
		str += "Nivel: " + nivel + "\n";
		str += "Tipo: " + tipo + "\n";
		str += "Vida: " + vida + "\n";
		str += "Ataque: " + ataque + "\n";
		str += "Defensa: " + defensa + "\n";
		str += "Fortalezas: " + fuerteContra + "\n";
		str += "Debilidades: " + debilContra;
		return str;

	}

}
