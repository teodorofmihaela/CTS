package main;

import clase.Autobuz;
import clase.Flota;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("Audi","A1",10);
        Autobuz autobuz2=new Autobuz("Audi","A2",7);
        Autobuz autobuz3=new Autobuz("Audi","A3",30);
        Autobuz autobuz4=new Autobuz("Audi","A4",100);
        Autobuz autobuz5=new Autobuz("Audi","A5",30);
        Autobuz autobuz6=new Autobuz("Audi","A6",45);

        Flota flota1=new Flota("Flota1");
        Flota flota2=new Flota("Flota2");
        Flota flota3=new Flota("Flota3");
        Flota flotaMare=new Flota("Flota Companie");

        try{
            flota1.adaugaItem(autobuz1);
            flota1.adaugaItem(autobuz2);

            flota2.adaugaItem(autobuz3);

            flota3.adaugaItem(autobuz4);
            flota3.adaugaItem(autobuz5);
            flota3.adaugaItem(autobuz6);

            flotaMare.adaugaItem(flota1);
            flotaMare.adaugaItem(flota2);
            flotaMare.adaugaItem(flota3);

            flotaMare.descriereItem();

            flotaMare.stergeItem(flota2);

            flota1.stergeItem(autobuz1);

            System.out.println("Suma totala garantata = "+
             flotaMare.calculeazaSumaGarantata(3)+" lei(pret/loc=3lei)");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
