package simple_factory;

public class Tramvai extends MijlocTransport{


    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrImatriculare() {
        System.out.println("Tramvaiul are numarul de inmatriculare:" + this.getNrInmatriculare());
    }
}
