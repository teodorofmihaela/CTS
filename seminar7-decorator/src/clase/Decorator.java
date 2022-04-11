package clase;

public class Decorator extends DecoratorAbstract{

    private String mesaj;

    public Decorator(Imprimanta imprimanta,String mesaj) {
        super(imprimanta);
        this.mesaj=mesaj;
    }

    @Override
    public void printeazaVerso() {
        System.out.println("Verso: " +mesaj);
    }
}
