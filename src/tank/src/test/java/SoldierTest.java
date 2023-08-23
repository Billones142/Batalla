
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battle2023.ucp.Soldier;
import battle2023.ucp.Tank;

public class SoldierTest {
    @Test
    public void soldier_isAlive_true_test()
    {
        Soldier soldier1 = new Soldier();

        soldier1.damage(1.0);

        assertTrue(soldier1.isAlive());
    }

    @Test
    public void soldier_isAlive_false_test()
    {
        Soldier soldier1 = new Soldier();

        soldier1.damage(5.0);

        assertFalse(soldier1.isAlive());
    }

    @Test
    public void soldier_heal_dead_test()
    {
        Soldier soldier1 = new Soldier();

        soldier1.damage(5.0);
        assertFalse(soldier1.isAlive());
        soldier1.heal(5.0);
        assertTrue(soldier1.isAlive());
    }

    @Test
    public void soldier_attack_test()
    {
        Soldier soldier1= new Soldier();
        Tank tank1= new Tank();

        assertTrue(tank1.isAlive());
        
        for(int i= 0; i < 9 ; i++)
        {
            soldier1.attack(tank1);
        }
        assertTrue(tank1.isAlive());
        
        soldier1.attack(tank1);
        assertFalse(tank1.isAlive());
    }

}