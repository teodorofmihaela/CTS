package adapter.terestru;

import adapter.subteran.ValidatorMetrou;

public class AdapterObiecte implements ValidatorTerestru{
    private ValidatorMetrou validatorMetrou;

    public AdapterObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }
}
