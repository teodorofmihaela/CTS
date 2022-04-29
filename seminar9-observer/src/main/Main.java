package main;

import clase.Autobuz;
import clase.Calator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Autobuzul a plecat din statie");

        Calator calator1=new Calator("Maria");
        Calator calator2=new Calator("Andrei");
        Calator calator3=new Calator("Catalin");

        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);

        autobuz.anuntaCalator();
//        calator1.primesteAnunt("Autobuzul a plecat");
        System.out.println("\n");
        autobuz.eliminaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.anuntaCalator();
    }
}
