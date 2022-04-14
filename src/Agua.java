public class Agua extends Pokemon {
    
        public Agua(String nombre) {
            super(nombre);
            this.tipo = "AGUA";
            this.ataque = 5;
            this.defensa = 15;
            this.fuerteContra = "FUEGO";
            this.debilContra = "PLANTA";
            this.vida = 80;
        }
    
        public Agua(String nombre, String apodo) {
            super(nombre);
            this.apodo = apodo;
            this.tipo = "AGUA";
            this.ataque = 5;
            this.defensa = 15;
            this.fuerteContra = "FUEGO";
            this.debilContra = "PLANTA";
            this.vida = 80;
        }
    
        @Override
        public void obtenerEstadisticas() {
        	System.out.println("Mote: " + this.apodo);
        	super.obtenerEstadisticas();
        }
        
        
}
