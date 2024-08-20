package classes;

public class CachorroDoberman extends Cachorro{

    public CachorroDoberman (){
        latirComportamento = new LatirAtencao();
        pularComportamento = new PularAlto();
    }

    @Override
    public void mostrar() {
        System.out.println("Sou um doberman");
    }
}
