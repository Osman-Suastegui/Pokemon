public class Fuego extends Pokemon {

    public Fuego(String nombre) {
        super(nombre,70,70,"FUEGO",20,10,"PLANTA","AGUA");
    }
    
    public Fuego(String nombre, String apodo) {
        super(nombre,70,70,"FUEGO",20,10,"PLANTA","AGUA");
        this.apodo = apodo;
    }
    
    @Override
    public String obtenerEstadisticas() {
        return "Mote: " + this.apodo + "\n" + super.obtenerEstadisticas();
    }
    
    
    
    
    
    
    
    
    
    
    
    
  

    
}
