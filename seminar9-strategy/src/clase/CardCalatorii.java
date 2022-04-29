package clase;

public class CardCalatorii implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println(suma+" lei platit cu cardul de calatorii.");
    }
}
