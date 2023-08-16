
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battle2023.ucp.Soldier;
import battle2023.ucp.Tank;

public class TankTest 
{
    @Test
    public void tank_isAlive_true_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(1);

        assertEquals(true, tank1.isAlive());
        assertTrue(tank1.isAlive());
    }

    @Test
    public void tank_isAlive_false_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(5);

        assertEquals(false, tank1.isAlive());
        assertFalse(tank1.isAlive());
    }

    @Test
    public void tank_repair_dead_text()
    {
        Tank tank1 = new Tank();

        tank1.damage(5);
        assertEquals(false, tank1.isAlive());
        tank1.repair();
        assertEquals(true, tank1.isAlive());
    }

    @Test
    public void tank_reinforce_dead_test()
    {
        Tank tank1= new Tank();

        tank1.damage(5);
        assertEquals(false, tank1.isAlive());

        tank1.reinforce(1);
        assertEquals(false, tank1.isAlive());
    }

    @Test
    public void hasPilot_test()
    {
        Tank tank1= new Tank();
        Soldier soldier1= new Soldier();

        assertEquals(false, tank1.hasPilot());
        tank1.setPilot(soldier1);
        assertEquals(true, tank1.hasPilot());
    }

    @Test
    public void setPilot_test()
    {
        Tank tank1= new Tank();
        Soldier soldier1= new Soldier();

        assertEquals(false, tank1.hasPilot());
        tank1.setPilot(soldier1);
        assertEquals(true, tank1.hasPilot());
        assertEquals(soldier1, tank1.getPilot());
    }
}