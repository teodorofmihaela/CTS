package clase;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<Integer,Linie> mapLinie=new HashMap<>();

    public Factory() {
        this.mapLinie = mapLinie;
    }

public Linie getLinie(int nrLinie){
        Linie linie= mapLinie.get(nrLinie);
        if(mapLinie.containsKey(nrLinie)){
            System.out.println("Contine deja linia");
    }
        else {
            linie=new Linie(nrLinie,"prima statie","ultima statie");
            mapLinie.put(nrLinie,linie);
        }
        return linie;
}
}
