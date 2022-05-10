package clase;

public class MetrouHandler extends MijlocTransportHandler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {
        if(distanta<limita) {
            System.out.println("A fost ales metroul deoarece distanta este de: " + distanta + " km.");
        }else {
            super.getSuccesor().afiseazaMijlocTransport(distanta);
        }

    }
}
