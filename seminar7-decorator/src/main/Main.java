package main;

import clase.Decorator;
import clase.DecoratorAbstract;
import clase.Imprimanta;
import clase.ImprimantaDeBilet;

public class Main {
    public static void main(String[] args) {
        Imprimanta imprimanta=new ImprimantaDeBilet(5);
        imprimanta.printeazaBilet();

        DecoratorAbstract decorator=new Decorator(imprimanta,"Paste fericit!");

        decorator.printeazaBilet();
        decorator.printeazaVerso();
    }
}
