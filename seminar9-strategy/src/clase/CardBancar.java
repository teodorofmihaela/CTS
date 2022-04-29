package clase;

public class CardBancar implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println(suma+" lei platit cu cardul bancar.");
    }
}
