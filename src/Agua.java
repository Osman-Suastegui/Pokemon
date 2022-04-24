public class Agua extends Pokemon {
    
        public Agua(String nombre) {
            super(nombre,95,95,"AGUA",15,15,"FUEGO","PLANTA");
        }
    
        public Agua(String nombre, String apodo) {
            super(nombre,95,95,"AGUA",15,15,"FUEGO","PLANTA");
            this.apodo = apodo;
        }
    
        @Override
        public String obtenerEstadisticas() {
            return "Mote: " + this.apodo + "\n" + super.obtenerEstadisticas();
        }
        
        
}
