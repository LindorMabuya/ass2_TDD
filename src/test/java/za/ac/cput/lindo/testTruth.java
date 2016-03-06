package za.ac.cput.lindo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class testTruth {
    private student science;

    @Before
    public void setUp() throws Exception {
        science = new student("Cindy", "Science");

    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue(true);
        Assert.assertTrue(science.getName().equalsIgnoreCase(science.getName()));
    }
}
