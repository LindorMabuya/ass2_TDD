package za.ac.cput.lindo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class testAddition {
    addition add = new addition();

    @Test
    public void testAdd() throws Exception {
        int sum = add.add(2,5);
        Assert.assertEquals(7,sum);
    }
}
