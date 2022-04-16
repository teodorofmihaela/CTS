package clase;

public class Autobuz implements MijlocTransport{
    int nrLinie;
    int nrPasageri;

    public Autobuz(int nrLinie, int nrPasageri) {
        this.nrLinie = nrLinie;
        this.nrPasageri = nrPasageri;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public void setNrPasageri(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul de pe linia "+nrLinie+" are "+nrPasageri+" calatori.");
    }
}
