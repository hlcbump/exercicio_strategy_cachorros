package classes;

import interfaces.LatirComportamento;
import interfaces.PularComportamento;

public abstract class Cachorro {

    LatirComportamento latirComportamento;
    PularComportamento pularComportamento;

    public Cachorro() {
    }

    public abstract void mostrar();

    public void performanceLatir(){
        latirComportamento.latir();
    }

    public void performancePular(){
        pularComportamento.pular();
    }

    public void setLatirComportamento(LatirComportamento latirComportamento) {
        this.latirComportamento = latirComportamento;
    }

    public void setPularComportamento(PularComportamento pularComportamento) {
        this.pularComportamento = pularComportamento;
    }
}
