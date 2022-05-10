package clase;

public class Autobuz {
    private String sofer;
    private float consum;
    private int an;
    private String model;
    private int nrLocuri;

    public Autobuz(String sofer, int consum, int an, String model, int nrLocuri) {
        this.sofer = sofer;
        this.consum = consum;
        this.an = an;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("sofer='").append(sofer).append('\'');
        sb.append(", consum=").append(consum);
        sb.append(", an=").append(an);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }

    public Memento salveaza(){
        Memento mementoNou=new Memento(this.sofer,this.consum);
        return mementoNou ;
    }
    public void undo(Memento m){
        this.sofer=m.getNume();
        this.consum=m.getConsum();
    }
}
