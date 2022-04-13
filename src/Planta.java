public class Planta extends Pokemon {
    
    public Planta(String apodo, String nombre) {
        super(apodo, nombre);
        this.tipo = "PLANTA";
        this.ataque = 10;
        this.defensa = 10;
        this.fuerteContra = "AGUA";
        this.debilContra = "FUEGO";
        this.vida = 80;
    }
    
}
