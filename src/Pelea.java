public class Pelea {
    private int ganador = 0;
    private int danoHecho = 0;
    public void pelear(Pokemon miPoke,Pokemon pokeSalvaje,int moneda){
        if(moneda == 1){
            danoHecho = miPoke.atacar(pokeSalvaje);
            pokeSalvaje.vida -= danoHecho;
        }else{
            danoHecho = pokeSalvaje.atacar(miPoke);
            miPoke.vida -= danoHecho;
        }
        if(miPoke.vida <= 0) ganador = 2;
        if (pokeSalvaje.vida <= 0) ganador = 1;        
    }
    // 2 => gana el pokemon salvaje
    // 1 => gana el pokemon del usuario
    // 0 => aun no se decide el ganador
 
    public int obtenerGanador() {
        return ganador;
    }
    // genera numero 1 o 2 aleatoriamente
    public int lanzarMoneda(){
        return (int)(Math.random()*2)+1;
    }
    public int obtenerDanoHecho(){
        return danoHecho;
    }
}
