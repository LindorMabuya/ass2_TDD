package za.ac.cput.lindo;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class testFloatingPoints {
    floatingPoints newSalary = new floatingPoints();

    @Test
    public void testFloat() throws Exception {
        float results = newSalary.salaryIncrease(500.0f,15.2f);
        Assert.assertEquals(515.2f,results, 0.0f);
    }
}
