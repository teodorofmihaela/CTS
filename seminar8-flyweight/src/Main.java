import clase.Factory;
import clase.Linie;
import clase.ModelAutobuz;

import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {

        ModelAutobuz autobuz1=new ModelAutobuz("A1",2000,100);
        ModelAutobuz autobuz2=new ModelAutobuz("A2",2012,150);
        ModelAutobuz autobuz3=new ModelAutobuz("A3",2021,120);
        ModelAutobuz autobuz4=new ModelAutobuz("A4",2022,110);

        Factory fabrica=new Factory();
        Linie linie1=fabrica.getLinie(113);
        linie1.descriereAutobuzLinie(autobuz1);
        Linie linie2=fabrica.getLinie(134);
        linie2.descriereAutobuzLinie(autobuz2);
    }

}
