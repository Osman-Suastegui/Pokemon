public class Planta extends Pokemon {
    
    public Planta(String nombre) {
        super(nombre,90,90,"PLANTA",10,10,"AGUA","FUEGO");
    }
    
    public Planta(String nombre, String apodo) {
        super(nombre,90,90,"PLANTA",10,10,"AGUA","FUEGO");
        this.apodo = apodo;
    }
    
    @Override
    public String obtenerEstadisticas() {
        return "Mote: " + this.apodo + "\n" + super.obtenerEstadisticas();
    }
    
    
    
}
