import classes.Cachorro;
import classes.CachorroDoberman;
import classes.CachorroPudo;

public class MiniSimuCachorro {
    public static void main(String[] args) {
        Cachorro pudo = new CachorroPudo();
        pudo.mostrar();
        pudo.performanceLatir();
        pudo.performancePular();

        Cachorro doberman = new CachorroDoberman();
        doberman.mostrar();
        doberman.performanceLatir();
        doberman.performancePular();
    }
}