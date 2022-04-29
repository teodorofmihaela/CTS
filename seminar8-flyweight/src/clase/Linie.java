package clase;

public class Linie implements Flyweight{
        int nrLinie;
        String primaStatie;
        String ultimaStatie;

    public Linie(int nrLocuri, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLocuri;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void descriereAutobuzLinie(ModelAutobuz autobuz) {

        System.out.println(autobuz.toString()+toString());
    }
}
