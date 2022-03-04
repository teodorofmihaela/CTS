package cts.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Reader {
    public abstract List<Aplicant> readAplicanti(String file);
    public  void readAplicant(Scanner scanner, Aplicant aplicant){
            String nume = scanner.next();
            String prenume = (scanner.next()).toString();
            int varsta = Integer.valueOf(scanner.nextInt());
            int punctaj = Integer.valueOf(scanner.nextInt());
            int nrProiecte = Integer.valueOf(scanner.nextInt());
            String[] denumiriProiecte = new String[nrProiecte];
            for (int i = 0; i < nrProiecte; i++)
                denumiriProiecte[i] = scanner.next();
           aplicant.setNume(nume);
           aplicant.setPrenume(prenume);
           aplicant.setVarsta(varsta);
           aplicant.setPunctaj(punctaj);
           aplicant.setDenumireProiect(nrProiecte,denumiriProiecte);
    }

}