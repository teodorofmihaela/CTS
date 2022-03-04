package cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Reader reader = new AngajatReader();
        List<Aplicant> listaAplicanti;
        listaAplicanti = reader.readAplicanti("angajati.txt");
        for (Aplicant aplicant : listaAplicanti)
            System.out.println(aplicant.toString());
    }
}
