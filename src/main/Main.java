package main;

import zoo.Girafa;
import zoo.Ingrijitor;
import zoo.Zebra;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Ingrijitor ingrijitor=new Ingrijitor("Ingrijitor1");
        Zoo zoo=new Zoo("Gradin Zoologica Sibiu",ingrijitor);

        zoo.addAnimal(new Girafa("Meredy"));
        zoo.addAnimal(new Girafa("Nandy"));
        zoo.addAnimal(new Zebra("Zely"));

        zoo.hranesteAnimale();
    }
}
