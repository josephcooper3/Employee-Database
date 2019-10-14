import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Pat Lee", "SJ723693D", 30000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Pat Lee", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("SJ723693D", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, developer.getSalary(), 2);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.02);
        assertEquals(30600.00, developer.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, developer.payBonus(), 2);
    }

    @Test
    public void cannotRaiseSalaryByNegative(){
        developer.raiseSalary(-0.02);
        assertEquals(30000.00, developer.getSalary(), 2);
    }

}
