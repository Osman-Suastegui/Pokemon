public class Planta extends Pokemon {
    
    public Planta(String nombre) {
        super(nombre);
        this.tipo = "PLANTA";
        this.ataque = 10;
        this.defensa = 10;
        this.fuerteContra = "AGUA";
        this.debilContra = "FUEGO";
        this.vida = 80;
    }
    
    public Planta(String nombre, String apodo) {
        super(nombre);
        this.apodo = apodo;
        this.tipo = "PLANTA";
        this.ataque = 10;
        this.defensa = 10;
        this.fuerteContra = "AGUA";
        this.debilContra = "FUEGO";
        this.vida = 80;
    }
    
    @Override
    public void obtenerEstadisticas() {
    	System.out.println("Mote: " + this.apodo);
    	super.obtenerEstadisticas();
    }
    
}
