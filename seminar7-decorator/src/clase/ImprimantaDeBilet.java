package clase;

public class ImprimantaDeBilet implements Imprimanta{

    private float pretBilet;

    public ImprimantaDeBilet(float pretBilet){
        this.pretBilet=pretBilet;
    }
    @Override
    public void printeazaBilet() {
        System.out.println("Biletul are pretul de: " +pretBilet+" lei");
    }

}
