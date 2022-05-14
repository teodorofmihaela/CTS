package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareInCursa;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("B23SKY");
        Autobuz autobuz1=new Autobuz("B22SKY");
        Operator operator=new Operator();
        Comanda comanda=new ComandaPlecareInCursa(autobuz,108);
        Comanda comanda1=new ComandaPlecareInCursa(autobuz,203);
        Comanda comanda2=new ComandaPlecareInCursa(autobuz1,555);
        Comanda comanda3=new ComandaPlecareInCursa(autobuz1,233);
        operator.adaugaComanda(comanda);
        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(comanda3);
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
