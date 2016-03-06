package za.ac.cput.lindo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class objectEquality {
    private student science;

    @Before
    public void setUp() throws Exception {
        science = new student("Cindy","Science");
    }

    @Test
    public void testObjectEquality() throws Exception {
        Assert.assertEquals(science,science);
    }
}
