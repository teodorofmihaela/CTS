package cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();
    }


    @Override
    public String toString() {
        return "Angajat: " + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }


}
