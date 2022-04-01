package simple_factory;

public class Autobuz extends MijlocTransport{
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrImatriculare() {
        System.out.println("Autobuzul are numarul de inmatriculare:" + this.getNrInmatriculare());
    }
}
