package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
    List<Memento> listaMemento;

    public ManagerAutobaza() {

        listaMemento =new ArrayList<>();
    }
    public ManagerAutobaza(List<Memento> listaMemento) {
        this.listaMemento = listaMemento;
    }

    public Memento getElement(int pozitie){
        return listaMemento.get(pozitie);
    }
    public void adaugaMemento(Memento memento){
        listaMemento.add(memento);
    }
}
