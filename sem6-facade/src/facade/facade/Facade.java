package facade.facade;

public class Facade {
    public static void DeschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }
    public static void LiberUsi(Autobuz autobuz){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }
}
