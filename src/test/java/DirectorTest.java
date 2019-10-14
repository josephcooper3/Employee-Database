import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Janette Geen", "FE67268P", 100000.00, "Technology", 1000000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Janette Geen", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("FE67268P", director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100000.00, director.getSalary(), 2);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Technology", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.02);
        assertEquals(102000.00, director.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.00, director.payBonus(), 2);
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000.00, director.getBudget(), 2);
    }

}
