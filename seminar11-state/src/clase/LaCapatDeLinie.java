package clase;

public class LaCapatDeLinie implements State{
    @Override
    public void schimbaStare(Autobuz autobuz) {
        if(!(autobuz.getState() instanceof  LaCapatDeLinie)){
            System.out.println("Autobuzul cu nr: " + autobuz.getNrAutobuz() + " este la capat de linie");
            autobuz.setState(this);
        }

    }
}
