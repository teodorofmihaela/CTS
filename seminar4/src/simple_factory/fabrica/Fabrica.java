package simple_factory.fabrica;

import simple_factory.*;

public class Fabrica {
    public MijlocTransport getMijlocTransport(TipTransport tipTransport, String nrInmatriculare){
        switch (tipTransport){
            case Autobuz:
                Autobuz autobuz=new Autobuz(nrInmatriculare);
                return autobuz;
            case Tramvai:
                Tramvai tramvai=new Tramvai(nrInmatriculare);
                return tramvai;
            case Troleibuz:
                Troleibuz troleibuz=new Troleibuz(nrInmatriculare);
                return troleibuz;
            default:
                return null;
        }

    }
}
