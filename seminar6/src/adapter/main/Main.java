package adapter.main;

import adapter.subteran.ValidatorMetrou;
import adapter.terestru.AdapterObiecte;
import adapter.terestru.ValidatorAdapter;
import adapter.terestru.ValidatorAutobuz;
import adapter.terestru.ValidatorTerestru;

public class Main {
    static void valideazaBiletCalatorie(ValidatorTerestru validatorAdapter){
        validatorAdapter.valideazaBilet();
    }

    public static void main(String[] args) {
        ValidatorTerestru validatorTerestru=new ValidatorAutobuz();
        valideazaBiletCalatorie(validatorTerestru);

        ValidatorMetrou validatorMetrou=new ValidatorMetrou();
        AdapterObiecte adapterObiecte=new AdapterObiecte(validatorMetrou);
        valideazaBiletCalatorie(adapterObiecte);

//        valideazaBiletCalatorie(validatorMetrou);
        ValidatorAdapter validatorAdapter=new ValidatorAdapter();
        valideazaBiletCalatorie(validatorAdapter);

    }
}

