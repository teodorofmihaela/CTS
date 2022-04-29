package clase;

public class ValidatorCalatorie {
    private IModPlata modPlata;
    private double pretCalatorie;

    public ValidatorCalatorie(double pretCalatorie) {
        this.modPlata = new CardCalatorii();
        this.pretCalatorie = pretCalatorie;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public  void platesteCalatorie(IModPlata modPlata){
        modPlata.plateste(pretCalatorie);
    }
}
