package cts.clase;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        Reader reader = new AngajatReader();
        List<Aplicant> listaAplicanti;
        listaAplicanti = reader.readAplicanti("angajati.txt");
        for (Aplicant aplicant : listaAplicanti) {
            System.out.println(aplicant.toString());
            aplicant.afisareAcceptanta();
            aplicant.afisareSumaFinantata(495);
        }
    }
}
