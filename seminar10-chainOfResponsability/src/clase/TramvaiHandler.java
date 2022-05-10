package clase;

public class TramvaiHandler extends MijlocTransportHandler{
    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {
        if(distanta<limita) {
            System.out.println("A fost ales tramvaiul deoarece distanta este de: "+distanta+" km.");
        }else {
            super.getSuccesor().afiseazaMijlocTransport(distanta);
        }

    }
}
