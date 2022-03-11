package cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nr_proiecte;
    protected String[] denumireProiect;
    public static int pragPunctaj;

    public static void setPragPunctaj(int pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afisareAcceptanta() {
        if (punctaj > pragPunctaj)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public Aplicant() {
        super();
    }

    public void setDenumireProiect(int nr_proiecte, String[] denumireProiect) {
        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = new String[nr_proiecte];
        for (int i = 0; i < nr_proiecte; i++) {
            this.denumireProiect[i] = denumireProiect[i];
        }

    }


    public void afisareSumaFinantata(int suma) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste" + suma + " Euro/zi in proiect.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aplicant{");
        sb.append("Nume= ").append(nume);
        sb.append("Prenume= ").append(prenume);
        sb.append("varsta= ").append(varsta);
        sb.append("Punctaj=").append(punctaj);
        sb.append("Nr_proiecte=").append(nr_proiecte);
        sb.append("DenumireProiect=").append(Arrays.toString(denumireProiect));
        sb.append('}');
        return sb.toString();
    }
}
