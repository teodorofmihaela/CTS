package clase;

public class AutobuzHandler extends MijlocTransportHandler{
    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {
        if(distanta<limita) {
            System.out.println("A fost ales autobuzul deoarece distanta este de: "+distanta+" km.");
        }else {
            super.getSuccesor().afiseazaMijlocTransport(distanta);
        }

    }
}
