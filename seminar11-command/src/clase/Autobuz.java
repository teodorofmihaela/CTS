package clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void plecareInCursa(int nrLinie){
        System.out.println("Autobuzul cu nr: "+nrInmatriculare+" a plecat pe traseul "+nrLinie );
    }
}
