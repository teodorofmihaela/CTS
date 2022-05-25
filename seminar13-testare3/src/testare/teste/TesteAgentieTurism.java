package testare.teste;

import clase.AgentieTurism;
import clase.IPachet;
import clase.PachetTuristic;
import org.junit.Test;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetFake;
import testare.dubluri.PachetStub;
import testare.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class TesteAgentieTurism {


    @Test
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism=new AgentieTurism();
        IPachet dummy=new PachetDummy();
        agentieTurism.adaugaPachet(dummy);
        assertEquals(1,agentieTurism.getNumarPacheteTuristice());

    }

    @Test
    public void testCalculeazaStub(){
        AgentieTurism agentieTurism=new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetStub());
        agentieTurism.adaugaPachet(new PachetStub());
       assertEquals(2000, agentieTurism.calculareSumaTotalaPachete(),0.01);

    }

    @Test
    public void testCalculareSumaFake(){
        AgentieTurism agentieTurism=new AgentieTurism();
        PachetFake fake=new PachetFake();
        PachetFake fake1=new PachetFake();
        fake.setPret(1000.0);
        fake1.setPret(1000.0);
        agentieTurism.adaugaPachet(fake);
        agentieTurism.adaugaPachet(fake1);
        assertEquals(2000.0,agentieTurism.calculareSumaTotalaPachete(),0.01);
    }

    @Test
    public void testPoateRezerva(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(20);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public  void testPoateRezervaBondary(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(18);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testDiscountFake(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(75);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0,pachetTuristic.getPret(),0.01);
    }
    @Test
    public void testNuAplicaDiscountFake(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(35);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(200.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    public  void testAplicaDiscountBondary(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900,pachetTuristic.getPret(),0.01);
    }

    @Test
    public  void testAplicaDiscountBondaryMax(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0,pachetTuristic.getPret(),0.01);
    }
}
