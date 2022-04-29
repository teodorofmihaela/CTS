package clase;

public abstract class MijlocDeTransportPeSine {
    public abstract void  statie1();
    public abstract void statie2();
    public abstract void statie3();
    public abstract void statie4();
    public abstract void statie5();
    public abstract void statie6();
    public final void parcurgereTraseu(){
        statie1();
        statie2();
        statie3();
        statie4();
        statie5();
        statie6();
    }
    public  final void parcurgereTraseuSensInvers(){
        statie6();
        statie5();
        statie4();
        statie3();
        statie2();
        statie1();
    }
}
