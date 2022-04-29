package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subject{
    List<Observer> listaObserveri=new ArrayList<>();
    String anunt;

    public Autobuz( String anunt) {
        this.listaObserveri = listaObserveri;
        this.anunt = anunt;
    }

    public void anuntaPlecare(){
        System.out.println("Autobuzul pleaca de la capatul liniei.");
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaObserveri.add(observer);
    }

    @Override
    public void eliminaObserver(Observer observer) {
        listaObserveri.remove(observer);
    }

    @Override
    public void anuntaCalator() {
        for(Observer observer:listaObserveri){
            observer.primesteAnunt(anunt);
        }
    }
}
