package clase;

public class InCursa implements State{

    @Override
    public void schimbaStare(Autobuz autobuz) {
        if (autobuz.getState() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu nr: " + autobuz.getNrAutobuz() + " a plecat in cursa");
            autobuz.setState(this);
        }
        else {
            System.out.println("Autobuzul nu poate sa plece in cursa");
        }
    }

}
