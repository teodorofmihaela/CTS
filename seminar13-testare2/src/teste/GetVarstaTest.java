package teste;

import clase.Persoana;
import exceptii.CNPInvalidException;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {

    @Test
    public void testGetVarstaRight(){
        Persoana p=new Persoana("Andrei","5000907217897");
        assertEquals(21,p.getVarsta());
    }

    @Test
    public void testGetVarstaBounderyLower(){
        Persoana p=new Persoana("Andrei","3000101217897");
        assertEquals(222,p.getVarsta());
    }

    @Test
    public void testGetVarstaBounderyUpper(){
        Persoana p=new Persoana("Andrei","6220101217897");
        assertEquals(0,p.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void getVarstaError(){
        Persoana p=new Persoana("Andrei",null);
        p.getVarsta();
    }

    @Test(expected = CNPInvalidException.class)
    public void getVarstaErrorCNPInvalid(){
        Persoana p=new Persoana("Andrei","6250101217897");
        p.getVarsta();
    }

    @Test
    public void getVarstaCardinality1(){
        Persoana p=new Persoana("Andrei","6210101217897");
        assertEquals(1,p.getVarsta());
    }
}