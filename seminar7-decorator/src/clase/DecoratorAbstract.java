package clase;

public abstract class DecoratorAbstract implements Imprimanta{
    private Imprimanta imprimanta;
    @Override
    public void printeazaBilet() {
        imprimanta.printeazaBilet();
    }
    public abstract void printeazaVerso();

    public DecoratorAbstract(Imprimanta imprimanta) {
        this.imprimanta = imprimanta;
    }
}
