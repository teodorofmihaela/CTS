package clase;

public class LaReparat implements State{
    @Override
    public void schimbaStare(Autobuz autobuz) {
        if(autobuz.getState() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu nr: "+autobuz.getNrAutobuz()+" este la reparat.");
            autobuz.setState(this);
        }else {
            System.out.println("Autobuzul nu poate fi trimis in service.");
        }
    }
}
