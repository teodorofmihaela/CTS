package clase;

public class Memento {
    String nume;
    float consum;

    public String getNume() {
        return nume;
    }

    public float getConsum() {
        return consum;
    }

    public Memento(String nume, float consum) {
        this.nume = nume;
        this.consum = consum;
    }
}
