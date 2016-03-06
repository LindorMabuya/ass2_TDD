package za.ac.cput.lindo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class testIntegersNum {
    integersNum exam = new integersNum();

    @Test
    public void testNumbers() throws Exception {
        int results = exam.marks(20,5);
        Assert.assertEquals(25,results);
    }
}
