package teste;

import clase.Matematica;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    @Test
    public void test(){
        int s;
        Matematica m=new Matematica();
        s=m.suma(3,5);
        assertEquals(8,s);
    }
}