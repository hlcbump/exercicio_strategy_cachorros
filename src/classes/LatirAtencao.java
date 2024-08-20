package classes;

import interfaces.LatirComportamento;

public class LatirAtencao implements LatirComportamento {
    @Override
    public void latir() {
        System.out.println("Latido Atenção");
    }
}
