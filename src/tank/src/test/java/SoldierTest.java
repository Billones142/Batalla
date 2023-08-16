
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battle2023.ucp.Soldier;

public class SoldierTest {
    @Test
    public void soldier_isAlive_true_test()
    {
        Soldier soldier1 = new Soldier();

        soldier1.damage(1);

        assertEquals(true, soldier1.isAlive());
        assertTrue(soldier1.isAlive());
    }

    @Test
    public void soldier_isAlive_false_test()
    {
        Soldier soldier1 = new Soldier();

        soldier1.damage(5);

        assertEquals(false, soldier1.isAlive());
        assertFalse(soldier1.isAlive());
    }

    @Test
    public void soldier_heal_dead_test()
    {
        Soldier soldier1 = new Soldier();

        soldier1.damage(5);
        assertEquals(false, soldier1.isAlive());
        soldier1.heal(5);
        assertEquals(true, soldier1.isAlive());
    }

}