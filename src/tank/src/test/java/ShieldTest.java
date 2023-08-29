
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battle2023.ucp.Entities.ShieldBase;
import battle2023.ucp.Entities.ShieldRandomPercentage;
import battle2023.ucp.Entities.Soldier;

public class ShieldTest {
    @Test
    public void shield1_test(){
        ShieldRandomPercentage shield1= new ShieldRandomPercentage("peron",100.0);

        
        Double damage = shield1.use(5.5);
        
        
        assertTrue(damage>=0 && 5.5>=damage);;

    }

    @Test
    public void shield_test(){
        Soldier soldier1= new Soldier("Peron", 5.0);

        
        soldier1.damage(4.999);

        assertEquals(true, soldier1.isAlive());


    }

    @Test
    public void can_use_test(){
        Soldier soldier1= new Soldier("Peron", 5.0);

        
        soldier1.damage(10.0);

        assertEquals(true, soldier1.isAlive());


    }

    
}
