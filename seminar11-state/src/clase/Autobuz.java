package clase;

public class Autobuz {

    private int nrAutobuz;
    private State state;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.state=new LaCapatDeLinie();
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    private void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pleacaInCursa(){
        State inCursa=new InCursa();
        inCursa.schimbaStare(this);
    }
    public void intraInService(){
        State laReparat=new LaReparat();
        laReparat.schimbaStare(this);
    }
    public void ieseDinService(){
        State laCapat=new LaCapatDeLinie();
        laCapat.schimbaStare(this);
    }
    public void ajungeLaCapat(){
        State laCapatDeLinie=new LaCapatDeLinie();
        laCapatDeLinie.schimbaStare(this);
    }
}
