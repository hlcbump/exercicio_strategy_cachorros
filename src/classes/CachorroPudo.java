package classes;

import interfaces.*;

public class CachorroPudo extends Cachorro{

    public CachorroPudo() {
        latirComportamento = new LatirNervoso();
        pularComportamento = new PularBaixo();
    }

    @Override
    public void mostrar() {
        System.out.println("Sou um Pudo");
    }
}
