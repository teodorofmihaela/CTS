package main;

import clase.Autobuz;
import clase.InCursa;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz(123);
        autobuz1.pleacaInCursa();
        autobuz1.ajungeLaCapat();
        autobuz1.ieseDinService();
        autobuz1.intraInService();
        autobuz1.ieseDinService();
//        autobuz1.setState(new InCursa());
        autobuz1.ajungeLaCapat();
        autobuz1.pleacaInCursa();
        autobuz1.ajungeLaCapat();
    }
}
