public class Fuego extends Pokemon {

    public Fuego(String nombre) {
        super(nombre);
        this.tipo = "FUEGO";
        this.ataque = 20;
        this.defensa = 10;
        this.fuerteContra = "PLANTA";
        this.debilContra = "AGUA";
        this.vida = 70;
    }
    
    public Fuego(String nombre, String apodo) {
        super(nombre);
        this.apodo = apodo;
        this.tipo = "FUEGO";
        this.ataque = 20;
        this.defensa = 10;
        this.fuerteContra = "PLANTA";
        this.debilContra = "AGUA";
        this.vida = 70;
    }
    
    @Override
    public void obtenerEstadisticas() {
    	System.out.println("Mote: " + this.apodo);
    	super.obtenerEstadisticas();
    }
    
    
    
    
    
    
    
    
    
    
    
    
  

    
}
