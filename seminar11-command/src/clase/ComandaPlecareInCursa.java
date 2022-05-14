package clase;

public class ComandaPlecareInCursa implements Comanda{
    private Autobuz autobuz;
    private int nrLinie;

    public ComandaPlecareInCursa(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void executa() {
        autobuz.plecareInCursa(nrLinie);
    }
}
