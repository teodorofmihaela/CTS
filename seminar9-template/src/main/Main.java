package main;

import clase.MijlocDeTransportPeSine;
import clase.Tramvai;
import clase.TramvaiProbe;

public class Main {
    public static void main(String[] args) {
        Tramvai tramvai = new Tramvai();
        tramvai.parcurgereTraseu();
        tramvai.parcurgereTraseuSensInvers();
        TramvaiProbe tramvaiProbe=new TramvaiProbe();
        tramvaiProbe.parcurgereTraseu();
        tramvaiProbe.parcurgereTraseuSensInvers();
    }
}
