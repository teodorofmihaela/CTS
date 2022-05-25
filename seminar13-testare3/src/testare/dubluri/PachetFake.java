package testare.dubluri;

import clase.IPachet;

public class PachetFake implements IPachet {
    Double pret;
    boolean rezerva;

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setRezerva(boolean rezerva) {
        this.rezerva = rezerva;
    }

    @Override
    public boolean poateRezerva() {
        return this.rezerva;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return this.pret;
    }
}
