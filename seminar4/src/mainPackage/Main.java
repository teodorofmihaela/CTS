package mainPackage;

import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1;//constructor privat=> nu pot crea noi instante
        s1=Singleton.getInstanta();
        Singleton s2;
        s2=Singleton.getInstanta();

        System.out.println(s1);
        System.out.println(s2);
    }
}
