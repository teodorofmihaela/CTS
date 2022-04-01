package FactoryMethod.fabrica;

import FactoryMethod.fabrica.MijlocTransport.MijlocTransport;
import FactoryMethod.fabrica.MijlocTransport.Troleibuz;
import MijlocTransport.*;

public class FabricaTroleibuz implements AbstractFactory{
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
