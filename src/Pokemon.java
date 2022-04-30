
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

	protected Pokemon(String nombre, int vida, int vidaTotal, String tipo, int ataque, int defensa, String fuerteContra,String debilContra) {
		this.nombre = nombre;
		this.vida = vida;
		this.vidaTotal = vidaTotal;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.fuerteContra = fuerteContra;
		this.debilContra = debilContra;
	}

	protected int atacar(Pokemon pokeDanado) {
		// FORMULA DEL dano
		int danoHecho = ((this.ataque + 10) * this.nivel) - (pokeDanado.defensa * pokeDanado.nivel);
		// CALCULO DEL dano HECHO
		if (this.fuerteContra.equals(pokeDanado.tipo)) danoHecho *= 2;
		if (this.debilContra.equals(pokeDanado.tipo)) danoHecho -= 5;
		return danoHecho;

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
	public void subirNivel(){
		this.nivel++;
	}

}
