package singleton;

public class Singleton {
    private static Singleton instanta=null;//=new Singleton();->eagerInitialization
    public synchronized static Singleton getInstanta(){
        if(instanta==null){
            instanta=new Singleton();
        }
        return instanta;
    }

    private Singleton(){
    }
}
