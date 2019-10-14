import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sammie King", "SJ723693D", 40000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Sammie King", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("SJ723693D", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, databaseAdmin.getSalary(), 2);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.02);
        assertEquals(40800.00, databaseAdmin.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, databaseAdmin.payBonus(), 2);
    }

}
