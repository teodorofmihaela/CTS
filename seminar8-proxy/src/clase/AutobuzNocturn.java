package clase;

public class AutobuzNocturn implements MijlocTransport{//proxy

    Autobuz autobuz;

    public AutobuzNocturn(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrPasageri()>0){
            autobuz.opresteInStatie();
        }else{
            System.out.println("Autobuzul de pe linia "+ autobuz.nrLinie+" se retrage din circulatie.");
        }
    }
}
