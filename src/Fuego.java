public class Fuego extends Pokemon {
	Fuerte FuerteContra = Fuerte.PLANTA;
	Debil DebilContra = Debil.AGUA;
	
	public Fuego(String nombre,String tipo) {
		super(nombre,tipo);
	}
	
	@Override
	public void obtenerEstadisticas() {
		super.obtenerEstadisticas();
		System.out.println("Fuerte Contra: " + this.FuerteContra);
		System.out.println("Debil Contra: " + this.DebilContra);
	}
	
}
