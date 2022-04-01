package FactoryMethod.fabrica;

import FactoryMethod.fabrica.MijlocTransport.MijlocTransport;
import FactoryMethod.fabrica.MijlocTransport.Tramvai;
import MijlocTransport.*;

public class FabricaTramvai implements AbstractFactory{
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
