package main;

import clase.CardBancar;
import clase.CardCalatorii;
import clase.Sms;
import clase.ValidatorCalatorie;

public class Main {
    public static void main(String[] args) {
        ValidatorCalatorie validatorCalatorie=new ValidatorCalatorie(3);
        validatorCalatorie.platesteCalatorie(new CardBancar());
        validatorCalatorie.platesteCalatorie(new Sms());
        validatorCalatorie.platesteCalatorie(new CardCalatorii());
    }
}
