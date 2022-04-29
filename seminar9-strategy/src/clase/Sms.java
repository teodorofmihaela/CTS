package clase;

public class Sms implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println(suma+"  lei platit prin sms.");
    }
}
