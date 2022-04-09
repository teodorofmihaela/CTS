package facade.main;

import facade.facade.Autobuz;
import facade.facade.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        Facade.DeschideUsi(autobuz);
        Facade.LiberUsi(autobuz);

    }
}
