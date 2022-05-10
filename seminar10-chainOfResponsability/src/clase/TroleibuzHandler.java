package clase;

public class TroleibuzHandler extends MijlocTransportHandler{

    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {
        if(distanta<limita) {
            System.out.println("A fost ales troleibuz deoarece distanta este de: " + distanta + " km.");
        }else {
            super.getSuccesor().afiseazaMijlocTransport(distanta);
        }
    }
}
