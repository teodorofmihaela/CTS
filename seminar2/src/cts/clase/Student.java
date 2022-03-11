package cts.clase;


public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;



    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }


    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }


    public Student() {
        super();

    }



    @Override
    public String toString() {
        return "Student: " + "Facultate=" + facultate + ", An_studii=" + an_studii;
    }


}
