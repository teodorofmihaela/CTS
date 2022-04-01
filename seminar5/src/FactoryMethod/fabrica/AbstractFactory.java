package FactoryMethod.fabrica;

import FactoryMethod.fabrica.MijlocTransport.MijlocTransport;

public interface AbstractFactory {
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare);
}
