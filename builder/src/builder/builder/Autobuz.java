package builder.builder;

public class Autobuz {
    private String model;
    private String numeSofer;
    private boolean oprireCapat;
    private boolean deschideUsi;
    private String textrDerulat;
    private String nrInmatriculare;

    public Autobuz() {
        this.model = "Mercedes";
        this.numeSofer = "Dorel";
        this.oprireCapat = true;
        this.deschideUsi = true;
        this.textrDerulat = "STB in miscare";
        this.nrInmatriculare = "B104VVV";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setOprireCapat(boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
    }

    public void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    public void setTextrDerulat(String textrDerulat) {
        this.textrDerulat = textrDerulat;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", oprireCapat=").append(oprireCapat);
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", textrDerulat='").append(textrDerulat).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
