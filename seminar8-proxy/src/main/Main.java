package main;

import clase.Autobuz;
import clase.AutobuzNocturn;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {

        MijlocTransport autobuz=new Autobuz(113,100);
        autobuz.opresteInStatie();
        MijlocTransport autobuzNocturn=new AutobuzNocturn((Autobuz) autobuz);
        autobuzNocturn.opresteInStatie();
// testare schimbare comportament
        ((Autobuz) autobuz).setNrPasageri(0);
        autobuz.opresteInStatie();
        autobuzNocturn.opresteInStatie();

    }
}
