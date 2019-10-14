import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Kaya Lewis", "DJ1668G", 60000.00, "Operations");
    }

    @Test
    public void canGetName(){
        assertEquals("Kaya Lewis", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DJ1668G", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000.00, manager.getSalary(), 2);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Operations", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.02);
        assertEquals(61200.00, manager.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600.00, manager.payBonus(), 2);
    }

}
