package sk.upjs.ics.paz1c.debilnicek;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class SuborovyUlohaDaoTest {
    
    public SuborovyUlohaDaoTest() {
    }

    @Test
    public void testDajUlohy() {
        System.out.println("dajUlohy");
        SuborovyUlohaDao instance = new SuborovyUlohaDao();
        //List<Uloha> expResult = null;
        List<Uloha> result = instance.dajUlohy();
        assertEquals(2, result.size());
        fail("The test case is a prototype.");
    }
    
}
