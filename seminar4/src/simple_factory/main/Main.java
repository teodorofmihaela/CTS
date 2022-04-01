package simple_factory.main;

import simple_factory.Autobuz;
import simple_factory.MijlocTransport;
import simple_factory.TipTransport;
import simple_factory.fabrica.Fabrica;

public class Main {
    public static void main(String[] args) {
         Fabrica fabrica=new Fabrica();
        MijlocTransport autobuz=fabrica.getMijlocTransport(TipTransport.Autobuz,"B103AUM");
        MijlocTransport tramvai= fabrica.getMijlocTransport(TipTransport.Tramvai,"SV34SVS");
        MijlocTransport troleibuz= fabrica.getMijlocTransport(TipTransport.Troleibuz,"IF55SSS");
        autobuz.afisareNrImatriculare();
        troleibuz.afisareNrImatriculare();
        tramvai.afisareNrImatriculare();
    }
}
