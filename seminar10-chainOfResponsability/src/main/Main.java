package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler tramvai=new TramvaiHandler(3);
        MijlocTransportHandler autobuz=new AutobuzHandler(10);
        MijlocTransportHandler troleibuz=new TroleibuzHandler(14);
        MijlocTransportHandler metrou=new MetrouHandler(1000);


        troleibuz.setSuccesor(autobuz);
        autobuz.setSuccesor(tramvai);
        tramvai.setSuccesor(metrou);

        troleibuz.afiseazaMijlocTransport(2);
        troleibuz.afiseazaMijlocTransport(4);
        troleibuz.afiseazaMijlocTransport(6);
        troleibuz.afiseazaMijlocTransport(8);
        troleibuz.afiseazaMijlocTransport(12);

        System.out.println("\nPentru Cluj:\n");


        MijlocTransportHandler metrouCluj=new MetrouHandler(2);
        MijlocTransportHandler tramvaiCluj=new TramvaiHandler(4);
        MijlocTransportHandler troleibuzCluj=new TroleibuzHandler(9);
        MijlocTransportHandler autobuzCluj=new AutobuzHandler(10000);

        metrouCluj.setSuccesor(tramvaiCluj);
        tramvaiCluj.setSuccesor(troleibuzCluj);
        troleibuzCluj.setSuccesor(autobuzCluj);

        metrouCluj.afiseazaMijlocTransport(1);
        metrouCluj.afiseazaMijlocTransport(8);
        metrouCluj.afiseazaMijlocTransport(11);





    }
}
