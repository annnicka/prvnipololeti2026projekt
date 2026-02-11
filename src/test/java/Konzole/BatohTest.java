package Konzole;

import Predmety.Predmet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatohTest {

    class TestovaciPredmet extends Predmet {
        public TestovaciPredmet(String jmeno) {
            super(jmeno);
        }
    }

    @Test
    public void testPridaniDoBatohu() {
        Batoh batoh = new Batoh();
        Predmet p = new TestovaciPredmet("Predmet");
        
        batoh.pridatDoBatohu(p);
        
        Assertions.assertTrue(batoh.jeVBatohu("Predmet"));
        Assertions.assertEquals(1, batoh.getPredmetyVBatohu().size());
    }


    @Test
    public void testOdebraniZBatohu() {
        Batoh batoh = new Batoh();
        Predmet p = new TestovaciPredmet("Predmet");
        batoh.pridatDoBatohu(p);
        batoh.odebiraniVsehoZBatohu("Predmet");

        Assertions.assertFalse(batoh.jeVBatohu("Klic"));
        Assertions.assertEquals(0, batoh.getPredmetyVBatohu().size());
    }

    @Test
    public void testJestlyJeBatohPlny() {
        Batoh batoh = new Batoh();
        Predmet p = new TestovaciPredmet("Kamen");
        batoh.pridatDoBatohu(p);

        Assertions.assertTrue(batoh.jeVBatohu("Kamen"));
        Assertions.assertFalse(batoh.jeVBatohu("Nuz"));
    }
}
