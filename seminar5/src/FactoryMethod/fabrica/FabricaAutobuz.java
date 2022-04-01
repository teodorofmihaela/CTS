package FactoryMethod.fabrica;

import FactoryMethod.fabrica.MijlocTransport.Autobuz;
import FactoryMethod.fabrica.MijlocTransport.MijlocTransport;
import MijlocTransport.*;

public class FabricaAutobuz implements AbstractFactory{

    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
