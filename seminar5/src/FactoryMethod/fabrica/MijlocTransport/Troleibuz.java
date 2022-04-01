package FactoryMethod.fabrica.MijlocTransport;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrImatriculare() {
        System.out.println("Troleibuzul are numarul de inmatriculare:" + this.getNrInmatriculare());
    }
}
