package classes;

import interfaces.LatirComportamento;

public class LatirNervoso implements LatirComportamento {

    @Override
    public void latir() {
        System.out.println("Latido Nervoso");
    }
}
