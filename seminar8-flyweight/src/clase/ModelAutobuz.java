package clase;

public class ModelAutobuz {
    String model;
    int anFaricatie;
    int nrLocuri;

    public ModelAutobuz(String model, int anFaricatie, int nrLocuri) {
        this.model = model;
        this.anFaricatie = anFaricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModelAutobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFaricatie=").append(anFaricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
