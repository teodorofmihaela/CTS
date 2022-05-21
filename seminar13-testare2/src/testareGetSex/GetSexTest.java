package testareGetSex;

import clase.Persoana;
import exceptii.CNPInvalidException;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetSexTest {

    @Test
    public void getSexRight() {
        Persoana persoanaF=new Persoana("Maria","6000505215698");
        assertEquals("F", persoanaF.getSex());
        Persoana persomanaM=new Persoana("Andrei","5000135217668");
        assertEquals("M",persomanaM.getSex());
    }

    @Test
    public void getSexBoundaryF(){
        Persoana persoanaF=new Persoana("Maria","6000505215698");
        assertEquals("F",persoanaF.getSex());
    }
    @Test
    public void getSexBoundaryM(){
        Persoana persoanaM=new Persoana("Andrei","1000505215698");
        assertEquals("M",persoanaM.getSex());
    }

    @Test
    public void GetSexCrossCheck(){
        Persoana persoanaF=new Persoana("Andrei","5000505215698");
        int primaCifra=persoanaF.CNP.charAt(0);
        assertEquals(primaCifra%2==0?"F":"M",persoanaF.getSex());
    }
    @Test
    public void testGetSexShouldThrowExceptionJUnit3(){
        Persoana persoanaF=new Persoana("Andrei","0000505215698");
        try {
            persoanaF.getSex();
            fail("Metoda nu arunca exceptie");
        } catch (CNPInvalidException e) {

        }
    }
        @Test(expected = CNPInvalidException.class)
    public void testGetSexShouldThrowExceptionJunit4(){
            Persoana persoanaF=new Persoana("Andrei","0000505215698");
            persoanaF.getSex();
        }

//        @Test(expected = CNPInvalidException.class)
//        public void testGetSexShouldThrowExceptionJunit5(){
//            Persoana persoanaF=new Persoana("Andrei","0000505215698");
//            persoanaF.getSex();
//            assertThrows()
//        }
    @Test(expected = NullPointerException.class)
    public void testGetSexNullPointerEx(){
        //si pt existence
        Persoana persoanaM=new Persoana("Andrei",null);
        persoanaM.getSex();
    }

        @Test(timeout = 5)
        public void testGetSexPerformance(){
            Persoana persoanaM=new Persoana("Andrei","6000505215698");
            persoanaM.getSex();
        }

        @Test
    public void testGetSeComformance(){
            Persoana persoanaM=new Persoana("Andrei","6000505215698");
           assertEquals(1,persoanaM.getSex().length());
        }

        @Test
    public void testGetSexRangeUpper(){
            Persoana persoanaM=new Persoana("Andrei","7000505215698");
            assertEquals("N/A",persoanaM.getSex());
        }


        }