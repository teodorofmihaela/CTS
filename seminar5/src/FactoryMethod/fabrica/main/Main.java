package FactoryMethod.fabrica.main;

import FactoryMethod.fabrica.FabricaAutobuz;
import FactoryMethod.fabrica.FabricaTramvai;
import FactoryMethod.fabrica.FabricaTroleibuz;
import FactoryMethod.fabrica.MijlocTransport.MijlocTransport;

public class Main {
    public static void main(String[] args) {
         MijlocTransport autobuz=new FabricaAutobuz().returneazaMijlocTransport(" B104VVV");
        MijlocTransport tramvai=new FabricaTramvai().returneazaMijlocTransport(" B104SSS");
        MijlocTransport troleibuz=new FabricaTroleibuz().returneazaMijlocTransport(" B104TTT");

        autobuz.afisareNrImatriculare();
        tramvai.afisareNrImatriculare();
        troleibuz.afisareNrImatriculare();

    }
}
