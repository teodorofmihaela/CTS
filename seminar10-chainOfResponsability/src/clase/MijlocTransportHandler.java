package clase;

public abstract class MijlocTransportHandler {
    int limita;
    MijlocTransportHandler succesor;

    public void setSuccesor(MijlocTransportHandler succesor) {
        this.succesor = succesor;
    }

    public MijlocTransportHandler(int limita) {
        this.limita=limita;
        this.succesor = null;
    }

    public MijlocTransportHandler getSuccesor() {
        return succesor;
    }

    public abstract void afiseazaMijlocTransport(int distanta);

}
