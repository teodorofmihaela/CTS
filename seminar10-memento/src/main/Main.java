package main;

import clase.Autobuz;
import clase.ManagerAutobaza;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz=new Autobuz("Andrei", 3,2021,"Audi",45);

        ManagerAutobaza manger=new ManagerAutobaza();
        manger.adaugaMemento(autobuz.salveaza());

        autobuz.setSofer("Mihai");
        manger.adaugaMemento(autobuz.salveaza());

        autobuz.setConsum(5);
        manger.adaugaMemento(autobuz.salveaza());

        System.out.println(autobuz.toString());
        autobuz.undo(manger.getElement(0));
        System.out.println(autobuz.toString());
    }
}
